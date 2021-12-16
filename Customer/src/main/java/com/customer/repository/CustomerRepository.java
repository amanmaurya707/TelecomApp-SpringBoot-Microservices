package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//if phoneno and password are matches then return 1 if any one is wrong then return 0
@Query(value = "select count(*) from customer where phone_no=? and password=?",nativeQuery = true)
public Integer loginCheck(Long phoneNumber,String password);
}
