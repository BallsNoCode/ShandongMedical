package com.kkb.service;

import com.kkb.mapper.UserMapper;
import com.kkb.pojo.User;
import com.kkb.pojo.UserExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author APPDE
 */
@Service
public class LoginService {
    @Resource
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<User> checkLogin(Integer username,String password){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andU_loginNameEqualTo(username);
        criteria.andU_passWordLike(password);
        List<User> userList = userMapper.selectByExample(example);
        return userList;
    }
}
