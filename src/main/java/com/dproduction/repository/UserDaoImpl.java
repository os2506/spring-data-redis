package com.dproduction.repository;


import com.dproduction.model.User;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> fetchAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User fetchUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	// implementation using redisTemplate
	/*
	 * @Autowired private RedisTemplate redisTemplate;
	 * 
	 * private static final String KEY = "USER";
	 * 
	 * @Override public boolean saveUser(User user) { try {
	 * redisTemplate.opsForHash().put(KEY, user.getId().toString(), user); return
	 * true; } catch (Exception e) { e.printStackTrace(); return false; } }
	 * 
	 * @Override public List<User> fetchAllUser() { List<User> users; users =
	 * redisTemplate.opsForHash().values(KEY); return users; }
	 * 
	 * @Override public User fetchUserById(Long id) { User user; user = (User)
	 * redisTemplate.opsForHash().get(KEY,id.toString()); return user; }
	 * 
	 * @Override public boolean deleteUser(Long id) { try {
	 * redisTemplate.opsForHash().delete(KEY,id.toString()); return true; } catch
	 * (Exception e) { return false; } }
	 * 
	 * @Override public boolean updateUser(Long id, User user) { try {
	 * redisTemplate.opsForHash().put(KEY, id, user); return true; } catch
	 * (Exception e) { e.printStackTrace(); return false; } }
	 */
	 
}