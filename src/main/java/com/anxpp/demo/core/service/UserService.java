package com.anxpp.demo.core.service;
import java.util.List;

import com.anxpp.demo.core.entity.User;
public interface UserService {
	User findById(Integer id);
	User save(String name);
	List<User> findAll();
	List<User> findByIdGreaterThanAndNameLike(Integer id,String name);
}