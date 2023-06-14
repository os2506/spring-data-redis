package com.dproduction.repository;

import java.util.List;

import com.dproduction.model.User;

public interface UserDao {
	
	
	  boolean saveUser(User user);
	  
	  List<User> fetchAllUser();
	  
	  User fetchUserById(Long id);
	  
	  boolean deleteUser(Long id);
	  
	  boolean updateUser(Long id, User user);
	 

}
