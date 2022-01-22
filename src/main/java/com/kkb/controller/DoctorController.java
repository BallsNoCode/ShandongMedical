package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Doctor;
import com.kkb.service.DoctorService;
import com.kkb.vo.QueryHosVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author APPDE
 */
@Controller
@RequestMapping(value = "doctor")
@ResponseBody
public class DoctorController {

    @Resource
    private DoctorService doctorService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public ResultVO<Doctor> queryByPage(Integer pageNum, QueryHosVO vo){
        if (pageNum == null || pageNum < 1){
            pageNum = 1;
        }
        PageInfo<Doctor> doctorPageInfo = doctorService.queryByPage(pageNum, vo);
        return new ResultVO<>(doctorPageInfo);
    }
}
