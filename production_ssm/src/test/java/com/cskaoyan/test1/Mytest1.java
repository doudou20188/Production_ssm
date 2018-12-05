package com.cskaoyan.test1;

import com.cskaoyan.bean.User;
import com.cskaoyan.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;

/**
 * @Auther: YangTao
 * @Date: 2018/12/5 0005
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Mytest1 {
    @Autowired
    UserMapper userMapper;
    @Test
    public void test1(){
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("username","mingming");
        stringObjectHashMap.put("password","123456");
        User userFromDB = userMapper.findUserFromDB(stringObjectHashMap);
        System.out.println(userFromDB+"233333333333333333");

    }



}
