package com.taskrig.test.dao;

import java.util.List;
import com.taskrig.test.model.User;

public interface UserDaoI {
	
	public List<User> getAllUser();
	public User getUser(int userId);
	public int addUser(User user);
	public int updateUser(User user);
	public void deleteUser(int userId);

}
