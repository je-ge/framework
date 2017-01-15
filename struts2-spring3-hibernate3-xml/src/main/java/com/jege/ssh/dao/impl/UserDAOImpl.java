package com.jege.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jege.ssh.dao.UserDAO;
import com.jege.ssh.entity.User;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

  @Override
  public void save(User user) {
    getHibernateTemplate().save(user);
  }

  @Override
  public void update(User user) {
    getHibernateTemplate().update(user);
  }

  @Override
  public void delete(Long id) {
    User user = findByKey(id);
    if (user != null) {
      getHibernateTemplate().delete(user);
    }
  }

  @Override
  public User findByKey(Long id) {
    return getHibernateTemplate().get(User.class, id);
  }

  @Override
  public List<User> findAll() {
    return getHibernateTemplate().loadAll(User.class);
  }

}
