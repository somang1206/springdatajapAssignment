package com.ohgiraffers.pet.dto;

import java.util.Date;

public class MemberDTO {

    private int memCode;
    private String memId;
    private String memPwd;
    private String memName;
    private Date memBirth;
    private String memEmail;
    private String memAdrs;
    private String memAdrsDetail;
    private Date memWithdrawal;
    private int memDogGum;
    private String memRole;
    private int memAuth;
    private String mailKey;
    private Date banPeriod;


    public MemberDTO() {
    }

    public MemberDTO(int memCode, String memId, String memPwd, String memName, Date memBirth, String memEmail, String memAdrs, String memAdrsDetail, Date memWithdrawal, int memDogGum, String memRole, int memAuth, String mailKey, Date banPeriod) {
        this.memCode = memCode;
        this.memId = memId;
        this.memPwd = memPwd;
        this.memName = memName;
        this.memBirth = memBirth;
        this.memEmail = memEmail;
        this.memAdrs = memAdrs;
        this.memAdrsDetail = memAdrsDetail;
        this.memWithdrawal = memWithdrawal;
        this.memDogGum = memDogGum;
        this.memRole = memRole;
        this.memAuth = memAuth;
        this.mailKey = mailKey;
        this.banPeriod = banPeriod;
    }

    public int getMemCode() {
        return memCode;
    }

    public void setMemCode(int memCode) {
        this.memCode = memCode;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getMemPwd() {
        return memPwd;
    }

    public void setMemPwd(String memPwd) {
        this.memPwd = memPwd;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public Date getMemBirth() {
        return memBirth;
    }

    public void setMemBirth(Date memBirth) {
        this.memBirth = memBirth;
    }

    public String getMemEmail() {
        return memEmail;
    }

    public void setMemEmail(String memEmail) {
        this.memEmail = memEmail;
    }

    public String getMemAdrs() {
        return memAdrs;
    }

    public void setMemAdrs(String memAdrs) {
        this.memAdrs = memAdrs;
    }

    public String getMemAdrsDetail() {
        return memAdrsDetail;
    }

    public void setMemAdrsDetail(String memAdrsDetail) {
        this.memAdrsDetail = memAdrsDetail;
    }

    public Date getMemWithdrawal() {
        return memWithdrawal;
    }

    public void setMemWithdrawal(Date memWithdrawal) {
        this.memWithdrawal = memWithdrawal;
    }

    public int getMemDogGum() {
        return memDogGum;
    }

    public void setMemDogGum(int memDogGum) {
        this.memDogGum = memDogGum;
    }

    public String getMemRole() {
        return memRole;
    }

    public void setMemRole(String memRole) {
        this.memRole = memRole;
    }

    public int getMemAuth() {
        return memAuth;
    }

    public void setMemAuth(int memAuth) {
        this.memAuth = memAuth;
    }

    public String getMailKey() {
        return mailKey;
    }

    public void setMailKey(String mailKey) {
        this.mailKey = mailKey;
    }

    public Date getBanPeriod() {
        return banPeriod;
    }

    public void setBanPeriod(Date banPeriod) {
        this.banPeriod = banPeriod;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memCode=" + memCode +
                ", memId='" + memId + '\'' +
                ", memPwd='" + memPwd + '\'' +
                ", memName='" + memName + '\'' +
                ", memBirth=" + memBirth +
                ", memEmail='" + memEmail + '\'' +
                ", memAdrs='" + memAdrs + '\'' +
                ", memAdrsDetail='" + memAdrsDetail + '\'' +
                ", memWithdrawal=" + memWithdrawal +
                ", memDogGum=" + memDogGum +
                ", memRole='" + memRole + '\'' +
                ", memAuth=" + memAuth +
                ", mailKey='" + mailKey + '\'' +
                ", banPeriod=" + banPeriod +
                '}';
    }
}
