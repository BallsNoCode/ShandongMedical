package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Hosregister;
import com.kkb.service.hosService;
import com.kkb.vo.HosResultVO;
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
@RequestMapping("registration")
@ResponseBody
public class hosController {

    @Resource
    private hosService hosService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public ResultVO<HosResultVO> queryByPage(Integer pageNum, Integer pageSize, QueryHosVO vo) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        PageInfo<HosResultVO> hosResultVOPageInfo = hosService.queryByPage(pageNum, pageSize, vo);
        return new ResultVO<>(hosResultVOPageInfo);
    }

    @RequestMapping(value = "look",method = RequestMethod.GET)
    public HosResultVO queryLook(Integer HosR_id){
        HosResultVO hosResultVO = hosService.queryLook(HosR_id);
        return hosResultVO;
    }
}
