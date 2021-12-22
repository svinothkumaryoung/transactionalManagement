package com.transactionalManagement.transactionalManagement.PaymentManagement;

import com.transactionalManagement.transactionalManagement.model.StudentInformation;

public class PaymentAck {
    public StudentInformation studentInformation;
    private double amt;
    private String Status;

    public PaymentAck() {
    }

    public PaymentAck(StudentInformation studentInformation, double amt, String status) {
        super();
        this.studentInformation = studentInformation;
        this.amt = amt;
        Status = status;
    }

    public StudentInformation getStudentInformation() {
        return studentInformation;
    }

    public void setStudentInformation(StudentInformation studentInformation) {
        this.studentInformation = studentInformation;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
