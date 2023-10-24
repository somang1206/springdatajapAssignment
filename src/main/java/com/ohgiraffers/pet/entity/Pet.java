package com.ohgiraffers.pet.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "pet_info")
//@Builder(toBuilder = true)
public class Pet {
    @Id
    @Column(name = "pet_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int petCode;

    @Column(name = "pet_nick")
    private String petNick;

    @Column(name ="pet_kind")
    private String petKind;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "pet_birth")
    private LocalDate petBirth;

    @Column(name = "pet_gender")
    private String petGender;

    @Column(name = "pet_weight")
    private float petWeight;

    @Column(name = "pet_neutered")
    private char petNeutered;

    @Column(name = "pet_introduce")
    private String petIntroduce;

    @Column(name = "ref_mem_code")
    private int refMemCode;

    protected Pet() {}

    public Pet petCode(int val){
        petCode = val;
        return this;
    }


    public Pet petNick(String val){
        petNick = val;
        return this;
    }

    public Pet petKind(String val){
        petKind = val;
        return this;
    }

    public Pet petBirth(LocalDate val){
        petBirth = val;
        return this;
    }

    public Pet petGender(String val){
        petGender = val;
        return this;
    }

    public Pet petWeight(float val){
        petWeight = val;
        return this;
    }

    public Pet petNeutered(char val){
        petNeutered = val;
        return this;
    }

    public Pet petIntroduce(String val){
        petIntroduce = val;
        return this;
    }

    public Pet refMemCode(int val){
        refMemCode = val;
        return this;
    }

    public Pet builder(){
        return new Pet(petCode, petNick, petKind, petBirth, petGender, petWeight, petNeutered, petIntroduce, refMemCode);
    }

    public Pet(Pet pet){
        this.petCode = pet.getPetCode();
        this.petNick = pet.getPetNick();
        this.petKind = pet.getPetKind();
        this.petBirth = pet.getPetBirth();
        this.petGender = pet.getPetGender();
        this.petWeight = pet.getPetWeight();
        this.petNeutered = pet.getPetNeutered();
        this.petIntroduce = pet.getPetIntroduce();
        this.refMemCode = pet.getRefMemCode();
    }

    public Pet(int petCode, String petNick, String petKind, LocalDate petBirth, String petGender, float petWeight, char petNeutered, String petIntroduce, int refMemCode) {
        this.petCode = petCode;
        this.petNick = petNick;
        this.petKind = petKind;
        this.petBirth = petBirth;
        this.petGender = petGender;
        this.petWeight = petWeight;
        this.petNeutered = petNeutered;
        this.petIntroduce = petIntroduce;
        this.refMemCode = refMemCode;
    }

    public int getPetCode() {
        return petCode;
    }

    public String getPetNick() {
        return petNick;
    }

    public String getPetKind() {
        return petKind;
    }

    public LocalDate getPetBirth() {
        return petBirth;
    }

    public String getPetGender() {
        return petGender;
    }

    public float getPetWeight() {
        return petWeight;
    }

    public char getPetNeutered() {
        return petNeutered;
    }

    public String getPetIntroduce() {
        return petIntroduce;
    }

    public int getRefMemCode() {
        return refMemCode;
    }



    @Override
    public String toString() {
        return "Pet{" +
                "petCode=" + petCode +
                ", petNick='" + petNick + '\'' +
                ", petKind='" + petKind + '\'' +
                ", petBirth=" + petBirth +
                ", petGender='" + petGender + '\'' +
                ", petWeight=" + petWeight +
                ", petNeutered=" + petNeutered +
                ", petIntroduce='" + petIntroduce + '\'' +
                ", refMemCode=" + refMemCode +
                '}';
    }
}
