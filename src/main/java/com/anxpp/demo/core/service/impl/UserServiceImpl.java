package com.anxpp.demo.core.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anxpp.demo.core.dao.UserDao;
import com.anxpp.demo.core.entity.User;
import com.anxpp.demo.core.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}
	@Override
	public User save(String name) {
		return userDao.save(new User(name));
	}
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
	@Override
	public List<User> findByIdGreaterThanAndNameLike(Integer id, String name) {
		return userDao.findByIdGreaterThanAndNameLike(id, name+"%");
	}
}