package com.lolitaflamme.coffeefinderredis.repository;

import com.lolitaflamme.coffeefinderredis.domain.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, Long> {}
