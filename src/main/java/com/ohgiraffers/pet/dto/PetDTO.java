package com.ohgiraffers.pet.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class PetDTO {

    private int petCode;
    private String petNick;
    private String petKind;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate petBirth;
    private String petGender;
    private float petWeight;
    private char petNeutered;
    private String petIntroduce;
    private int refMemCode;

    public PetDTO() {
    }

    public PetDTO(int petCode, String petNick, String petKind, LocalDate petBirth, String petGender, float petWeight, char petNeutered, String petIntroduce, int refMemCode) {
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

    public void setPetCode(int petCode) {
        this.petCode = petCode;
    }

    public void setPetNick(String petNick) {
        this.petNick = petNick;
    }

    public void setPetKind(String petKind) {
        this.petKind = petKind;
    }

    public void setPetBirth(LocalDate petBirth) {
        this.petBirth = petBirth;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public void setPetWeight(float petWeight) {
        this.petWeight = petWeight;
    }

    public void setPetNeutered(char petNeutered) {
        this.petNeutered = petNeutered;
    }

    public void setPetIntroduce(String petIntroduce) {
        this.petIntroduce = petIntroduce;
    }

    public void setRefMemCode(int refMemCode) {
        this.refMemCode = refMemCode;
    }

    @Override
    public String toString() {
        return "PetDTO{" +
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
