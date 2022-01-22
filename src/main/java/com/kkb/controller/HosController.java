package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Hosregister;
import com.kkb.service.HosService;
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
@RequestMapping("registration")
@ResponseBody
public class HosController {

    @Resource
    private HosService hosService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public ResultVO<Hosregister> queryByPage(Integer pageNum, QueryHosVO vo) {
        if (pageNum == null || pageNum < 1) {
            pageNum = 1;
        }
        PageInfo<Hosregister> hosregisterPageInfo = hosService.queryByPage(pageNum, vo);
        return new ResultVO<>(hosregisterPageInfo);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResultVO<Hosregister> queryById(@PathVariable("id") Integer HosR_id) {
        Hosregister hosregister = hosService.queryById(HosR_id);
        return new ResultVO<>(hosregister);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResultVO<Hosregister> quitHos(@PathVariable("id") Integer HosR_id) {
        Integer integer = hosService.quitHos(HosR_id);
        if (integer == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResultVO<Hosregister> update(@PathVariable("id") Integer HosR_id, Hosregister hosregister) {
        hosregister.setHosR_id(HosR_id);
        Integer integer = hosService.updateHos(hosregister);
        if (integer == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public ResultVO<Hosregister> insert(Hosregister hosregister){
        hosregister.setHosR_state(0);
        Integer integer = hosService.insertHos(hosregister);
        if (integer == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，请稍后再试！");
    }
}
