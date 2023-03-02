package com.onlinefoodorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onlinefoodorder.model.User;


//JPA repository ==> used here to perform CRUD operations on user login
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
	User findByEmailidAndPassword(String emailId, String password);
	User findByEmailid(String emailId);
	User findByEmailidAndMobileno(String emailId, String mobileNo);

}
