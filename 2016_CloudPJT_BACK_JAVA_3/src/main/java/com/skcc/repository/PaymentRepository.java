package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.domain.payment.Payment;
import com.skcc.domain.user.User;

public interface PaymentRepository  extends JpaRepository<Payment, Integer>{
}
