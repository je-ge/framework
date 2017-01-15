package com.jege.ssh.action;

import com.jege.ssh.entity.User;
import com.jege.ssh.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:控制器类
 */
public class UserAction extends ActionSupport {
  private UserService userService;
  private User user;

  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  @Override
  public String execute() throws Exception {
    ActionContext.getContext().put("users", userService.findAll());
    return SUCCESS;
  }

  @Override
  public String input() throws Exception {
    if (user != null && user.getId() != null) {
      user = userService.findByKey(user.getId());
    }
    return INPUT;
  }

  public String save() throws Exception {
    if (user == null) {
      return execute();
    }
    if (user.getId() == null) {
      userService.save(user);
    } else {
      userService.update(user);
    }
    return "redirect";
  }

  public String delete() throws Exception {
    if (user != null && user.getId() != null) {
      userService.delete(user.getId());
    }
    return "redirect";
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
