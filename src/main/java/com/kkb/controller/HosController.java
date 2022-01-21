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
        if (pageNum == null || pageNum < 1){
            pageNum = 1;
        }
        PageInfo<Hosregister> hosregisterPageInfo = hosService.queryByPage(pageNum, vo);
        return new ResultVO<>(hosregisterPageInfo);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Hosregister queryById(@PathVariable("id") Integer HosR_id){
        return hosService.queryById(HosR_id);
    }


    @RequestMapping(value = "quit", method = RequestMethod.POST)
    public Integer quitHos(Integer HosR_id){
        return hosService.quitHos(HosR_id);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Integer update(Hosregister hosregister){
        return hosService.updateHos(hosregister);
    }
}
