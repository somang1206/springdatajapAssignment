package com.ohgiraffers.pet.service;

import com.ohgiraffers.pet.dto.MemberDTO;
import com.ohgiraffers.pet.dto.PetDTO;
import com.ohgiraffers.pet.entity.Member;
import com.ohgiraffers.pet.entity.Pet;
import com.ohgiraffers.pet.repository.MemberRepository;
import com.ohgiraffers.pet.repository.PetRepository;
import org.modelmapper.ModelMapper;
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
                .map(refmemcode -> modelMapper.map(refmemcode, MemberDTO.class))
                .collect(Collectors.toList());
    }


    @Transactional
    public void registNewPet(PetDTO newPet) {
        petRepository.save(modelMapper.map(newPet, Pet.class));
        System.out.println("등록!" + newPet);
    }

    @Transactional
    public void modifyPet(PetDTO modifyPet) {
        Pet foundPet = petRepository.findById(modifyPet.getPetCode()).orElseThrow(IllegalArgumentException::new);

        foundPet = foundPet.toBuilder().petNick(modifyPet.getPetNick()).build();
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
