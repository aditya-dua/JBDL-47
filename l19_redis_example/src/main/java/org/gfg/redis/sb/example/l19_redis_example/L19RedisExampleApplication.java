package org.gfg.redis.sb.example.l19_redis_example;

import java.util.List;

import org.gfg.redis.sb.example.l19_redis_example.entity.Product;
import org.gfg.redis.sb.example.l19_redis_example.repository.ProductDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class L19RedisExampleApplication {
	
	@Autowired
	private ProductDAORepository dao;

	@GetMapping
	public List<Object> fetchAllProducts(){
		return dao.getAll();
	}
	
	@PostMapping
	public Product save (@RequestBody Product product) {		
		return dao.save(product);
	}

	
	public static void main(String[] args) {
		SpringApplication.run(L19RedisExampleApplication.class, args);
	}

}
