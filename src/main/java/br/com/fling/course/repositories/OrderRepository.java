package br.com.fling.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fling.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
