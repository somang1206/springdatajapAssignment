package com.ohgiraffers.pet.repository;


import com.ohgiraffers.pet.entity.Pet;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Integer> {


    List<Pet> findByPetWeightGreaterThan(float petWeight, Sort petWeight1);
}
