package com.kkb.controller;

import com.kkb.pojo.User;
import com.kkb.service.AdminService;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author APPDE
 */
@Controller
@RequestMapping("user")
@ResponseBody
public class AdminController {
    @Resource
    private AdminService adminService = new AdminService();
    private RandomUtil randomUtil = new RandomUtil();

    @RequestMapping(value = "loginIn", method = RequestMethod.POST)
    public ResultVO<User> loginIn(Integer loginName, String password ,HttpSession session) {
        session.setAttribute("user",loginName);
        List<User> userList = adminService.checkLogin(loginName, password);
        if (userList.size() == 0) {
            return new ResultVO<>(500, "服务器异常");
        }
        User user = userList.get(0);
        return new ResultVO<>(user);
    }


    @RequestMapping(value = "loginOut", method = RequestMethod.GET)
    public void loginOut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.getSession().invalidate();
        resp.sendRedirect("/html/login.html");
    }

    @RequestMapping(value = "verify", method = RequestMethod.POST)
    public Integer verify() {
        return randomUtil.RandomNum();
    }

    @RequestMapping(value = "changePassword",method = RequestMethod.POST)
    public ResultVO<User> changePassword(String password,String newPassword,HttpSession session){
        Integer loginName = (Integer) session.getAttribute("user");
        System.out.println(loginName);
        Integer integer = adminService.changePassword(loginName,password, newPassword);
        if (integer == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "修改失败请查询密码！");
    }
}
