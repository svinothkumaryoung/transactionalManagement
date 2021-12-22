package com.transactionalManagement.transactionalManagement.controller;

import com.transactionalManagement.transactionalManagement.PaymentManagement.PaymentAck;
import com.transactionalManagement.transactionalManagement.PaymentManagement.PaymentRequest;
import com.transactionalManagement.transactionalManagement.services.BillPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    BillPaymentService billPaymentService;


    @PostMapping("/payBillNow")
    public PaymentAck PayCollegeFees(@RequestBody PaymentRequest paymentRequest)
    {
        return billPaymentService.payFees(paymentRequest);
    }
}
