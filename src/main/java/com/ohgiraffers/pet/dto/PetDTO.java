package com.ohgiraffers.pet.dto;

import java.util.Date;

public class PetDTO {

    private int petCode;
    private String petNick;
    private String petKind;
    private Date petBirth;
    private String petGender;
    private float petWeight;
    private char petNeutered;
    private String petIntroduce;
    private int refMemCode;

    public PetDTO() {
    }

    public PetDTO(int petCode, String petNick, String petKind, Date petBirth, String petGender, float petWeight, char petNeutered, String petIntroduce, int refMemCode) {
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

    public Date getPetBirth() {
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
