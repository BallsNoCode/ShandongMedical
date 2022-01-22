package com.kkb.service;

import com.kkb.mapper.UserMapper;
import com.kkb.pojo.User;
import com.kkb.pojo.UserExample;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author APPDE
 */
@Service
public class AdminService {
    @Resource
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<User> checkLogin(Integer loginName, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andU_loginNameEqualTo(loginName);
        criteria.andU_passWordLike(password);
        List<User> userList = userMapper.selectByExample(example);
        return userList;
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer changePassword(Integer loginName,String password, String newPassword) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andU_loginNameEqualTo(loginName);
        criteria.andU_passWordEqualTo(password);
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() <= 0){
            return 0;
        }
        User user = userList.get(0);
        user.setU_passWord(newPassword);
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
