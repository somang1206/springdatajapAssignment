package com.ohgiraffers.pet.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pet_info")
public class Pet {
    @Id
    @Column(name = "pet_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int petCode;

    @Column(name = "pet_nick")
    private String petNick;

    @Column(name ="pet_kind")
    private String petKind;

    @Column(name = "pet_birth")
    private Date petBirth;

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

    public Pet(int petCode, String petNick, String petKind, Date petBirth, String petGender, float petWeight, char petNeutered, String petIntroduce, int refMemCode) {
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
