package edu.njcc.rj1621.service.Impl;

import edu.njcc.rj1621.dao.UserDao;
import edu.njcc.rj1621.domain.User;
import edu.njcc.rj1621.service.UserSvc;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userSvr")
public class UserSvcImpl implements UserSvc {
    @Resource
    private UserDao userDao;

    public User queryUser(String username) {

        User user = userDao.selectUser(username);

        return user;
    }
}
