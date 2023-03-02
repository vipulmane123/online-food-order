package com.onlinefoodorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onlinefoodorder.model.Admin;


//JPA repository ==> used here to perform CRUD operations on admin login
@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
	
	Admin findByEmailidAndPassword(String emailId , String password);
	Admin findByEmailid(String emailId);

}
