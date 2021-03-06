package cn.itcast.sso.service;


import java.util.List;

import cn.itcast.sso.entity.User;


public interface UserService
{
    User  findUserById(Long id);
    List<User> findUserList();
    User findUserByNameAndPass(String username,String password);
    void save(User user);
    List<User> findAll();
    void delete(long id);
}
