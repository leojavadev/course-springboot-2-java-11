package br.com.fling.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fling.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{	

}
