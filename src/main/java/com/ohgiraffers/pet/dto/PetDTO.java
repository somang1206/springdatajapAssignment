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

    public void Pet() {
    }

    public void Pet(int petCode, String petNick, String petKind, Date petBirth, String petGender, float petWeight, char petNeutered, String petIntroduce, int refMemCode) {
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

    public void setPetCode(int petCode) {
        this.petCode = petCode;
    }

    public String getPetNick() {
        return petNick;
    }

    public void setPetNick(String petNick) {
        this.petNick = petNick;
    }

    public String getPetKind() {
        return petKind;
    }

    public void setPetKind(String petKind) {
        this.petKind = petKind;
    }

    public Date getPetBirth() {
        return petBirth;
    }

    public void setPetBirth(Date petBirth) {
        this.petBirth = petBirth;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public float getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(float petWeight) {
        this.petWeight = petWeight;
    }

    public char getPetNeutered() {
        return petNeutered;
    }

    public void setPetNeutered(char petNeutered) {
        this.petNeutered = petNeutered;
    }

    public String getPetIntroduce() {
        return petIntroduce;
    }

    public void setPetIntroduce(String petIntroduce) {
        this.petIntroduce = petIntroduce;
    }

    public int getRefMemCode() {
        return refMemCode;
    }

    public void setRefMemCode(int refMemCode) {
        this.refMemCode = refMemCode;
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
