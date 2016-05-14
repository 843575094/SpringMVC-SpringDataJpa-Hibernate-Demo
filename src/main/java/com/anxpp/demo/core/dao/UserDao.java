package com.anxpp.demo.core.dao;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anxpp.demo.core.entity.User;
public interface UserDao extends JpaRepository<User, Serializable>{
	User findById(Integer id);
	List<User> findByIdGreaterThanAndNameLike(Integer id,String name);
}