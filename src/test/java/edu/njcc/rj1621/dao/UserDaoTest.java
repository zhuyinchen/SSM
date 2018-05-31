package edu.njcc.rj1621.dao;

import edu.njcc.rj1621.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSelectUser() throws Exception{
        User user = userDao.selectUser("111");
        System.out.println(user.toString());
    }

    @Test
    public void testaddUser() throws Exception{

        User user1 = new User();
        user1.setUsername("333");
        user1.setPassword("333");

        userDao.addUser(user1);

    }
    @Test
    public void testdeleteUser() throws Exception{

        userDao.removeUser("333");

    }
    @Test
    public void testupdateUser() throws Exception{
        User user2 = new User();
        user2.setUsername("111");
        user2.setPassword("333");
        userDao.modifyUser(user2);
    }

    @Test
    public void testselectUserList() throws Exception{

        List<User> userList = userDao.selectUserList();

        for (User user: userList) {
            System.out.println(user.toString());
        }

    }
}
