package com.transactionalManagement.transactionalManagement.PaymentManagement;

import com.transactionalManagement.transactionalManagement.model.StudentBillPayment;
import com.transactionalManagement.transactionalManagement.model.StudentInformation;

public class PaymentRequest {
    private StudentBillPayment studentBillPayment;
    private StudentInformation studentInformation;

    public StudentBillPayment getStudentBillPayment() {
        return studentBillPayment;
    }

    public void setStudentBillPayment(StudentBillPayment studentBillPayment) {
        this.studentBillPayment = studentBillPayment;
    }

    public StudentInformation getStudentInformation() {
        return studentInformation;
    }

    public void setStudentInformation(StudentInformation studentInformation) {
        this.studentInformation = studentInformation;
    }
}
