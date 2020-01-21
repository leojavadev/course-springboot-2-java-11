package br.com.fling.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.fling.course.entities.Order;
import br.com.fling.course.entities.User;
import br.com.fling.course.repositories.OrderRepository;
import br.com.fling.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", null);
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", null);
		
		Order o1 = new Order(null, Instant.parse("2020-01-10T10:25:30Z"), u1);
		Order o2 = new Order(null, Instant.parse("2020-01-11T19:03:45Z"), u2);
		Order o3 = new Order(null, Instant.parse("2020-01-13T20:02:59Z"), u1);

		userRepository.saveAll(Arrays.asList(u1, u2));		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	

}
