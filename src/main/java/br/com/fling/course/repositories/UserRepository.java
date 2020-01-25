package br.com.fling.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fling.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{	

}
