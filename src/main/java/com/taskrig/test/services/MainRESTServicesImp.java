package com.taskrig.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taskrig.test.dao.UserDaoI;
import com.taskrig.test.model.User;

@Service
public class MainRESTServicesImp implements MainRESTServicesI{
	
	@Autowired
    private UserDaoI userDaoI;

	public List<User> getAllUser() {
		return userDaoI.getAllUser();
	}

	public User getUser(int userId) {		
		return userDaoI.getUser(userId);
	}

	public int addUser(User user) {		
		return userDaoI.addUser(user);
	}

	public int updateUser(User user) {		
		return userDaoI.updateUser(user);
	}

	public void deleteUser(int userId) {		
		userDaoI.deleteUser(userId);		
	}	

}
