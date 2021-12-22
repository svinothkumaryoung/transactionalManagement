package com.transactionalManagement.transactionalManagement.repo;

import com.transactionalManagement.transactionalManagement.model.StudentBillPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentBillPaymentRepo extends JpaRepository<StudentBillPayment,Integer> {
}
