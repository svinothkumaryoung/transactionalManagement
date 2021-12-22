package com.transactionalManagement.transactionalManagement.model;

import javax.persistence.*;

@Entity
@Table(name="billing")
public class StudentBillPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billno;

    @Column(name="accountNumber")
    private String AccountNumber;

    @Column(name="amt")
    private int amount;

    @Column(name="studentId")
    private int StudentId;

    public StudentBillPayment() {
    }

    public StudentBillPayment(int billno, String accountNumber, int amount, int studentId) {
        this.billno = billno;
        AccountNumber = accountNumber;
        this.amount = amount;
        StudentId = studentId;
    }

    public int getBillno() {
        return billno;
    }

    public void setBillno(int billno) {
        this.billno = billno;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
}
