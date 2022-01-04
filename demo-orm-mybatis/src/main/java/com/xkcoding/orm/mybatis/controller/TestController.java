package com.xkcoding.orm.mybatis.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xkcoding.orm.mybatis.$Proxy63;
import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;
import org.apache.ibatis.binding.MapperProxy;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhouyue01
 * @date 2021/12/10
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SqlSessionFactory factory;
    @Resource
    private ObjectMapper objectMapper;

    /**
     * 测试发送消息
     */

    @GetMapping("ok4")
    public void testSend() {
        User user = new User();
        user.setName("小明");
        user.setSex("难");
        $Proxy63 proxy63 = new $Proxy63(new MapperProxy<>(factory.openSession(), UserMapper.class, new ConcurrentHashMap<>()));
        proxy63.saveUser(user);
        userMapper.saveUser(user);
    }
}
