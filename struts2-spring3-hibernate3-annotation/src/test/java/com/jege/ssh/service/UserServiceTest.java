package com.jege.ssh.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jege.ssh.entity.User;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:单表CRUD Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {
  @Autowired
  UserService userService;

  @Test
  public void testSave() throws Exception {
    User user = new User("je-ge", 22);
    userService.save(user);
  }

  @Test
  public void testFindAll() throws Exception {
    System.out.println(userService.findAll());
  }
}
