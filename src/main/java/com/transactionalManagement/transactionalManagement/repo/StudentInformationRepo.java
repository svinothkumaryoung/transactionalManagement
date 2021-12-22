package com.transactionalManagement.transactionalManagement.repo;

import com.transactionalManagement.transactionalManagement.model.StudentInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInformationRepo extends JpaRepository<StudentInformation,Integer> {
}
