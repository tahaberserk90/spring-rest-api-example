package com.rest.api.spring.services;

import java.util.List;

import com.rest.api.spring.domain.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiService {
	
	List<User> getUsers(Integer limit);
	public Flux<User> getUsers(Mono<Integer> limit);

}
