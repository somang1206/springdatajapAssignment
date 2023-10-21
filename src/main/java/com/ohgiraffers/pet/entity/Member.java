package com.ohgiraffers.pet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "mem_info")
public class Member {

    @Id
    @Column(name = "mem_code")
    private int memCode;

    @Column(name = "mem_id")
    private String memId;

    @Column(name = "mem_pwd")
    private String memPwd;

    @Column(name = "mem_name")
    private String memName;

    @Column(name = "mem_birth")
    private Date memBirth;

    @Column(name = "mem_email")
    private String memEmail;

    @Column(name = "mem_adrs")
    private String memAdrs;

    @Column(name = "mem_adrs_detail")
    private String memAdrsDetail;

    @Column(name = "mem_withdrawal")
    private Date memWithdrawal;

    @Column(name = "mem_dog_gum")
    private int memDogGum;

    @Column(name = "mem_role")
    private String memRole;

    @Column(name = "mail_auth")
    private int mailAuth;

    @Column(name = "mail_key")
    private String mailKey;

    @Column(name = "ban_period")
    private Date banPeriod;

    protected Member(){}

    public Member(int memCode, String memId, String memPwd, String memName, Date memBirth, String memEmail, String memAdrs, String memAdrsDetail, Date memWithdrawal, int memDogGum, String memRole, int mailAuth, String mailKey, Date banPeriod) {
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
        this.mailAuth = mailAuth;
        this.mailKey = mailKey;
        this.banPeriod = banPeriod;
    }

    public int getMemCode() {
        return memCode;
    }

    public String getMemId() {
        return memId;
    }

    public String getMemPwd() {
        return memPwd;
    }

    public String getMemName() {
        return memName;
    }

    public Date getMemBirth() {
        return memBirth;
    }

    public String getMemEmail() {
        return memEmail;
    }

    public String getMemAdrs() {
        return memAdrs;
    }

    public String getMemAdrsDetail() {
        return memAdrsDetail;
    }

    public Date getMemWithdrawal() {
        return memWithdrawal;
    }

    public int getMemDogGum() {
        return memDogGum;
    }

    public String getMemRole() {
        return memRole;
    }

    public int getMailAuth() {
        return mailAuth;
    }

    public String getMailKey() {
        return mailKey;
    }

    public Date getBanPeriod() {
        return banPeriod;
    }



    @Override
    public String toString() {
        return "Member{" +
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
                ", memAuth=" + mailAuth +
                ", mailKey='" + mailKey + '\'' +
                ", banPeriod=" + banPeriod +
                '}';
    }
}
