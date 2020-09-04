package com.taskrig.test.services;

import java.util.List;
import com.taskrig.test.model.User;

public interface MainRESTServicesI {
	
	public List<User> getAllUser();
	public User getUser(int userId);
	public int addUser(User user);
	public int updateUser(User user);
	public void deleteUser(int userId);

}
