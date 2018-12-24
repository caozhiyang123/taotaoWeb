package cn.itcast.user.service;


import java.util.List;

import cn.itcast.user.entity.User;


public interface UserService
{
    User  findUserById(Long id);
    List<User> findUserList();
    User findUserByName(String username);
    void save(User user);
    List<User> findAll();
    void delete(long id);
}
