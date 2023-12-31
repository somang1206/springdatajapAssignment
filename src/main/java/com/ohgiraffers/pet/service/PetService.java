package com.ohgiraffers.pet.service;

import com.ohgiraffers.pet.dto.MemberDTO;
import com.ohgiraffers.pet.dto.PetDTO;
import com.ohgiraffers.pet.entity.Member;
import com.ohgiraffers.pet.entity.Pet;
import com.ohgiraffers.pet.repository.MemberRepository;
import com.ohgiraffers.pet.repository.PetRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetService {

    private final PetRepository petRepository;
    private final ModelMapper modelMapper;
    private final MemberRepository memberRepository;


    public PetService(PetRepository petRepository, ModelMapper modelMapper, MemberRepository memberRepository) {
        this.petRepository = petRepository;
        this.modelMapper = modelMapper;
        this.memberRepository = memberRepository;
    }

    public PetDTO findPetByCode(int petCode){
        Pet pet = petRepository.findById(petCode).orElseThrow(IllegalAccessError::new);

        return modelMapper.map(pet, PetDTO.class);
    }

    public List<PetDTO> findPetList() {
        List<Pet> petList = petRepository.findAll(Sort.by("petCode"));

        return petList.stream()
                .map(pet -> modelMapper.map(pet, PetDTO.class))
                .collect(Collectors.toList());
    }


    public List<MemberDTO> findAllMemCode() {
        List<Member> memCodeList = memberRepository.findAllMemCode();
        return memCodeList.stream()
                .map(member -> modelMapper.map(member, MemberDTO.class))
                .collect(Collectors.toList());
    }


    @Transactional
    public void registNewPet(PetDTO petDTO) {
        System.out.println("등록!" + petDTO);
        petRepository.save(modelMapper.map(petDTO, Pet.class));
    }

    @Transactional
    public void modifyPet(PetDTO modifyPet) {
        Pet foundPet = petRepository.findById(modifyPet.getPetCode()).orElseThrow(IllegalArgumentException::new);

        foundPet = foundPet.petNick(modifyPet.getPetNick()).builder();
    }

    @Transactional
    public void deletePet(Integer petCode) {
        petRepository.deleteById(petCode);
    }

    public List<PetDTO> findByPetWeight(float petWeight) {
        List<Pet> petList = petRepository.findByPetWeightGreaterThan(petWeight, Sort.by("petWeight").descending());

        return petList.stream()
                .map(pet -> modelMapper.map(pet, PetDTO.class))
                .collect(Collectors.toList());
    }
}
