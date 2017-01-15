package com.jege.ssh.service.impl;

import java.util.List;

import com.jege.ssh.dao.UserDAO;
import com.jege.ssh.entity.User;
import com.jege.ssh.service.UserService;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:
 */
public class UserServiceImpl implements UserService {
  private UserDAO userDAO;

  public void setUserDAO(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @Override
  public void save(User user) {
    userDAO.save(user);
  }

  @Override
  public void update(User user) {
    userDAO.update(user);
  }

  @Override
  public void delete(Long id) {
    userDAO.delete(id);
  }

  @Override
  public User findByKey(Long id) {
    return userDAO.findByKey(id);
  }

  @Override
  public List<User> findAll() {
    return userDAO.findAll();
  }

}
