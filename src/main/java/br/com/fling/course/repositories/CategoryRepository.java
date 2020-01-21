package br.com.fling.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fling.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
