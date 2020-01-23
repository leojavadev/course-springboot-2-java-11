package br.com.fling.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fling.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{	

}
