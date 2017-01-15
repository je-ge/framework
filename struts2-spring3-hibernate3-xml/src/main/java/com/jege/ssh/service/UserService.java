package com.jege.ssh.service;

import java.util.List;

import com.jege.ssh.entity.User;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:dao接口
 */
public interface UserService {
  void save(User user);

  void update(User user);

  void delete(Long id);

  User findByKey(Long id);

  List<User> findAll();
}
