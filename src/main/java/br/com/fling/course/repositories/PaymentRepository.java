package br.com.fling.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fling.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{	

}
