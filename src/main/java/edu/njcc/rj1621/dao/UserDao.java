package edu.njcc.rj1621.dao;

import edu.njcc.rj1621.domain.User;

import java.util.List;


public interface UserDao {

    User selectUser(String username);
    void addUser(User user);
    void removeUser(String username);
    void modifyUser(User user);
    List<User> selectUserList();
}
