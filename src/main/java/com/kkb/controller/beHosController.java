package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Behospital;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.Hosregister;
import com.kkb.service.DoctorService;
import com.kkb.service.HosService;
import com.kkb.service.beHosService;
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
@ResponseBody
@Controller
@RequestMapping("beHos")
public class beHosController {

    @Resource
    private beHosService beHosService;
    @Resource
    private HosService hosService;
    @Resource
    private DoctorService doctorService;

    @RequestMapping(value = "info",method = RequestMethod.GET)
    public ResultVO<Behospital> queryByPage(Integer pageNum, QueryHosVO vo){
        if (pageNum == null || pageNum < 1) {
            pageNum = 1;
        }
        PageInfo<Behospital> behospitalPageInfo = beHosService.queryByPage(pageNum, vo);
        return new ResultVO<>(behospitalPageInfo);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<Behospital> queryById(@PathVariable("id") Integer beH_id){
        Behospital behospital = beHosService.queryById(beH_id);
        if (behospital == null){
            behospital = new Behospital();
            Hosregister hosregister = hosService.queryById(beH_id);
            hosregister.setDoctor(doctorService.queryById(hosregister.getD_id()));
            behospital.setHosregister(hosregister);
        }
        return new ResultVO<>(behospital);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResultVO<Behospital> update(@PathVariable("id") Integer beH_id,Behospital behospital){
        behospital.setBeH_id(beH_id);
        Integer integer = beHosService.updateBeHos(behospital);
        if (integer == 1){
            return new ResultVO<>();
        }
        return new ResultVO<>(500,"服务器内部异常，请稍后再试！");
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public ResultVO<Behospital> insert(Behospital behospital){
        Integer integer = beHosService.insertBeHos(behospital);
        if (integer == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

}
