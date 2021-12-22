package com.transactionalManagement.transactionalManagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name="StudentInformation")
public class StudentInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RegisterNo;

    @Column(name="student_name")
    private String name;

    @Column(name="dept")
    private String dept;

    @Column(name="dob")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-YYYY")
    private Date dob;

    @Column(name="date_of_joining")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-YYYY")
    private Date dateOfJoining;

    @Column(name="payment")
    private int payment;

    public StudentInformation() {
    }

    public StudentInformation(int registerNo, String name, String dept, Date dob, Date dateOfJoining, int payment) {
        RegisterNo = registerNo;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.dateOfJoining = dateOfJoining;
        this.payment = payment;
    }

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
