package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.Hosregister;
import com.kkb.service.DoctorService;
import com.kkb.vo.QueryDoctorVO;
import com.kkb.vo.QueryHosVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResultVO<Doctor> queryByPage(Integer pageNum,Integer pageSize, QueryDoctorVO vo){
        if (pageNum == null || pageNum < 1){
            pageNum = 1;
        }
        if (pageSize == null || pageSize < 1){
            pageSize = 5;
        }
        PageInfo<Doctor> doctorPageInfo = doctorService.queryByPage(pageNum,pageSize, vo);
        return new ResultVO<>(doctorPageInfo);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResultVO<Doctor> queryById(@PathVariable("id") Integer d_id) {
        Doctor doctor = doctorService.queryById(d_id);
        return new ResultVO<>(doctor);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResultVO<Doctor> update(@PathVariable("id") Integer d_id, Doctor doctor) {
        System.out.println(doctor);
        doctor.setD_id(d_id);
        Integer integer = doctorService.updateDoc(doctor);
        if (integer == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public ResultVO<Doctor> insert(Doctor doctor){
        doctor.setD_state(0);
        Integer integer = doctorService.insertDoc(doctor);
        if (integer == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }
}
