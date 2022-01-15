package com.kkb.controller;

import com.kkb.pojo.User;
import com.kkb.service.LoginService;
import com.kkb.util.RandomUtil;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author APPDE
 */
@Controller
@RequestMapping("user")
@ResponseBody
public class LoginController {
    @Resource
    private LoginService loginService = new LoginService();
    private RandomUtil randomUtil = new RandomUtil();

    @RequestMapping(value = "loginIn", method = RequestMethod.POST)
    public ResultVO<User> loginIn(Integer username, String password) {

        List<User> userList = loginService.checkLogin(username, password);
        if (userList.size() == 0) {
            return new ResultVO<>(500, "服务器异常");
        }
        User user = userList.get(0);
        return new ResultVO<>(user);
    }


    @RequestMapping(value = "loginOut", method = RequestMethod.GET)
    public void loginOut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect("/html/login.html");
    }

    @RequestMapping(value = "verify", method = RequestMethod.POST)
    public Integer verify() {
        return randomUtil.RandomNum();
    }
}
