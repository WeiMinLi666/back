package com.wyman.module1.service;
import java.util.Date;

import com.wyman.module1.pojo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Wyman
 * @date 2024/7/26
 */


//用户服务测试


@SpringBootTest
class UserServiceTest {


    @Autowired
    UserService userService;
    @Test
    public void testAddUser(){
     User user = new User();
//     user.setId(0);
     user.setUsername("wyman");
     user.setUserAccount("2280506815");
     user.setAvatarUrl(0);
     user.setGender(0);
     user.setUserPassword("131232131");
     user.setPhone("");
     user.setEmail("");
     user.setUserStatus(0);
     user.setCreateTime(new Date());
     user.setUpdateTime(new Date());
     boolean result = userService.save(user);
        Assertions.assertTrue(result);


    }

}