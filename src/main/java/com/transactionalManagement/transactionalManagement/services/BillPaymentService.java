package com.transactionalManagement.transactionalManagement.services;

import com.transactionalManagement.transactionalManagement.PaymentManagement.PaymentAck;
import com.transactionalManagement.transactionalManagement.PaymentManagement.PaymentRequest;
import com.transactionalManagement.transactionalManagement.model.StudentBillPayment;
import com.transactionalManagement.transactionalManagement.model.StudentInformation;
import com.transactionalManagement.transactionalManagement.repo.StudentBillPaymentRepo;
import com.transactionalManagement.transactionalManagement.repo.StudentInformationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BillPaymentService {

    @Autowired
    StudentInformationRepo studentInformationRepo;

    @Autowired
    StudentBillPaymentRepo studentBillPaymentRepo;


    @Transactional
    public PaymentAck payFees(PaymentRequest paymentRequest)
    {
        StudentInformation studentInformation=paymentRequest.getStudentInformation();
        studentInformation=studentInformationRepo.save(studentInformation);

        StudentBillPayment studentBillPayment=paymentRequest.getStudentBillPayment();
        PaymentValidate.CheckAmt("vinoth",studentInformation.getPayment());
        studentBillPayment.setStudentId(studentInformation.getRegisterNo());
        studentBillPayment.setAmount(studentInformation.getPayment());
        studentBillPayment=studentBillPaymentRepo.save(studentBillPayment);
        return new PaymentAck(studentInformation,studentBillPayment.getAmount(),"Paid Successfully");
    }

}
