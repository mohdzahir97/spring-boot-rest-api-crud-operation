package com.codeforcspringbootrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.codeforcspringbootrest.model.User;
import com.codeforcspringbootrest.repository.UserRepository;
import com.codeforcspringbootrest.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	

	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		User u = userService.saveUser(user);
		if (u == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(u);
		}

	}
	
	

	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUser() {

		List<User> userlist = userService.allUser();
		if (userlist.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(userlist);

		} else {
			return ResponseEntity.status(HttpStatus.FOUND).body(userlist);
		}

	}

	@GetMapping("/user/{id}")
	public ResponseEntity<Optional<User>> getSingleUser(@PathVariable("id") int id) {

		Optional<User> optional=null;
		 User user=null;
		try {
			
		 optional = userService.getSingleUser(id);
		 user = optional.get();
		 
		} catch (Exception e) { }
		
		if (user==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.status(HttpStatus.FOUND).body(Optional.of(user));
		}	
	}
	

	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUserDetails(@RequestBody User user, @PathVariable("id") int id) {

		User u = userService.updateUserDetails(user, id);
		if (u==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {

			return ResponseEntity.status(HttpStatus.OK).body(u);
		}

		
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {

		boolean flag = userService.deleteUser(id);
		if (flag==false) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return  ResponseEntity.status(HttpStatus.OK).build();
		}
	}

	
	
	
	//---------------------------------Native Query----------------------------/////////
	
		@GetMapping("/userall")
		public List<User> getAllUsersByQuery(){
			List<User> users = userRepository.getAllUsersByQuery();
			
			return users;
		}
		
		@PostMapping("/userall-name")
		public List<User> findByName(@RequestBody User user){
			
			
			List<User> users = userRepository.findByNameAndState(user.getName(),user.getState());
			return users;
		}
	 	
		//-------------------------------------------------------------------------/////////
}
