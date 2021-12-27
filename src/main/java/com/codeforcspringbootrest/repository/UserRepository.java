package com.codeforcspringbootrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codeforcspringbootrest.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query(value = "select * from User",nativeQuery=true)
	public List<User> getAllUsersByQuery();
	
	
	public List<User> findByNameAndState(String name,String state);

}
