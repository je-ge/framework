package com.jege.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jege.ssh.dao.UserDAO;
import com.jege.ssh.entity.User;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:dao接口实现
 */
@Repository
public class UserDAOImpl implements UserDAO {

  @Autowired
  SessionFactory sessionFactory;

  private Session currentSession() {
    return sessionFactory.getCurrentSession();
  }

  @Override
  public void save(User user) {
    currentSession().save(user);
  }

  @Override
  public void update(User user) {
    currentSession().update(user);
  }

  @Override
  public void delete(Long id) {
    User user = findByKey(id);
    if (user != null) {
      currentSession().delete(user);
    }
  }

  @Override
  public User findByKey(Long id) {
    return (User) currentSession().get(User.class, id);
  }

  @Override
  public List<User> findAll() {
    return currentSession().createCriteria(User.class).list();
  }

}
