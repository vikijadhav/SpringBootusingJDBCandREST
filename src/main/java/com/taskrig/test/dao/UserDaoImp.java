package com.taskrig.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import com.taskrig.test.model.User;

@Repository
public class UserDaoImp implements UserDaoI {
	
	
	  @Autowired 
	  private JdbcTemplate template;
	  
	 /* 
	 * public void setTemplate(JdbcTemplate template) { this.template = template; }
	 */
	 

	public List<User> getAllUser() {
		return template.query("select * from User",new RowMapper<User>(){    
	        public User mapRow(ResultSet rs, int row) throws SQLException {    
	            User u=new User();    
	            u.setUserId(rs.getInt(1));    
	            u.setUserNo(rs.getString(2));    
	            u.setUserName(rs.getString(3));    
	            u.setUserposition(rs.getString(4));    
	            return u;    
	        }    
	    });		
	}

	public User getUser(int userId) {
		 String sql="select * from User where userId=?";    
		 return template.queryForObject(sql, new Object[]{userId},new BeanPropertyRowMapper<User>(User.class));    
	}

	public int addUser(User u) {		   
		String sql="insert into user(userId,userNo,userName,userposition) values(?, ?, ?, ?)";		
	    return template.update(sql, u.getUserId(), u.getUserNo(), u.getUserName(), u.getUserposition());   
	}

	public int updateUser(User u) {
//		String sql="update user set userNo='"+ u.getUserNo()+"', userName='"+ u.getUserName() +"',userposition='"+ u.getUserposition()+"' where userId='"+ u.getUserId()+"';";    
//	    return template.update(sql);	    
	    return template.update("update user " + " set userNo = ?, userName = ?, userposition = ? " + " where userId = ?",
	            new Object[] {
	            		u.getUserNo(), u.getUserName(), u.getUserposition(), u.getUserId()
	            });
	}

	public void deleteUser(int userId) {
//		String sql="delete from user where userId="+userId+"";  
//		System.out.println("1111111111111111111");
//	    template.update(sql, userId);

	    template.update("delete from user where userId=?", new Object[] {
	            userId
	        });
	    System.out.println("Deleted Record with ID = " + userId );
	}

}
