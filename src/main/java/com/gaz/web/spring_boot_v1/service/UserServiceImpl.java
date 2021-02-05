package com.gaz.web.spring_boot_v1.service;

import com.gaz.web.spring_boot_v1.dao.UserDao;
import com.gaz.web.spring_boot_v1.entity.Role;
import com.gaz.web.spring_boot_v1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public User getUserByName(String username) {
        return userDao.getUserByName(username);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public Role getRoleByName(String username) {
        return userDao.getRoleByName(username);
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public List<Role> getListRole() {
        return userDao.getListRole();
    }
}