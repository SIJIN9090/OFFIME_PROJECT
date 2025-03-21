package com.example.commute.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "MEMBER_NAME", nullable = false, length = 10)
    private String memberName;

    @Column(name = "MEMBER_EMAIL", nullable = false, length = 50, unique = true)
    private String memberEmail;

    @Column(name = "MEMBER_PASSWORD", nullable = false, length = 20)
    private String memberPassword;

    @Column(name = "MEMBER_PHONE", nullable = false, length = 20)
    private String memberPhone;

    @Enumerated(EnumType.STRING)
    @Column(name = "MEMBER_ROLE", nullable = false)
    private MemberRole memberRole;

    @Column(name = "MEMBER_TEAM", length = 50)
    private String memberTeam;

    @Column(name = "MEMBER_JOIN_DATE", nullable = false)
    private LocalDateTime memberJoinDate;

    @Column(name = "MEMBER_DELETE_DATE")
    private LocalDateTime memberDeleteDate;

    @Column(name = "MEMBER_VACATION", nullable = false)
    private Integer memberVacation;

    @Column(name = "MEMBER_WORK_STATUS", length = 100)
    private String memberWorkStatus;

    // Getters and Setters
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public MemberRole getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(MemberRole memberRole) {
        this.memberRole = memberRole;
    }

    public String getMemberTeam() {
        return memberTeam;
    }

    public void setMemberTeam(String memberTeam) {
        this.memberTeam = memberTeam;
    }

    public LocalDateTime getMemberJoinDate() {
        return memberJoinDate;
    }

    public void setMemberJoinDate(LocalDateTime memberJoinDate) {
        this.memberJoinDate = memberJoinDate;
    }

    public LocalDateTime getMemberDeleteDate() {
        return memberDeleteDate;
    }

    public void setMemberDeleteDate(LocalDateTime memberDeleteDate) {
        this.memberDeleteDate = memberDeleteDate;
    }

    public Integer getMemberVacation() {
        return memberVacation;
    }

    public void setMemberVacation(Integer memberVacation) {
        this.memberVacation = memberVacation;
    }

    public String getMemberWorkStatus() {
        return memberWorkStatus;
    }

    public void setMemberWorkStatus(String memberWorkStatus) {
        this.memberWorkStatus = memberWorkStatus;
    }
}

enum MemberRole {
    ADMIN,
    USER
}
