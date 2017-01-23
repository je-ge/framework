package com.jege.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jege.ssh.dao.UserDAO;
import com.jege.ssh.entity.User;
import com.jege.ssh.service.UserService;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:业务逻辑层
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDAO userDAO;

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
  @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
  public User findByKey(Long id) {
    return userDAO.findByKey(id);
  }

  @Override
  @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
  public List<User> findAll() {
    return userDAO.findAll();
  }

}
