package com.codeforcspringbootrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.codeforcspringbootrest.model.User;
import com.codeforcspringbootrest.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {

		User u = userRepository.save(user);
		return u;
	}

	public List<User> allUser() {
		Iterable<User> users=null;
		try {
			 users = userRepository.findAll();
		} catch (Exception e) {
			
		}
		
		 return (List<User>) users;
	}

	public Optional<User> getSingleUser(int id) {
		Optional<User> optional = null;
		try {
			optional = userRepository.findById(id);
		} catch (Exception e) {
			System.out.println("hello");
		}
		return optional;
	}
	
	

	public boolean deleteUser(int id) {
		Optional<User> optional=null;
		boolean flag=false;
		try {
			
			optional = userRepository.findById(id);
			if (optional.isEmpty()) {
				flag=false;
			}else {
				flag=true;
				userRepository.deleteById(id);
			}	
		} catch (Exception e) {
			
		}
		return flag;
	}

	
	
	
	public User updateUserDetails(User user, int id) {

		Optional<User> optional=null;
		User userresult=null;
		try {
			optional = userRepository.findById(id);
			User u = optional.get();
			
			u.setName(user.getName());
			u.setCity(user.getCity());
			u.setState(user.getState());
			u.setRegion(user.getRegion());

			userresult = userRepository.save(user);
		} catch (Exception e) { }


		return userresult;
	}

}
