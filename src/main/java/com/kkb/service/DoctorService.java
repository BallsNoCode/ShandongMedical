package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.DoctorExample;
import com.kkb.vo.QueryHosVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author APPDE
 */
@Service
public class DoctorService {

    @Resource
    private DoctorMapper doctorMapper;

    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Doctor> queryByPage(Integer pageNum, QueryHosVO vo){
        DoctorExample example = new DoctorExample();
        PageHelper.startPage(pageNum,5);
        List<Doctor> doctors = doctorMapper.selectByExample(example);
        return new PageInfo<>(doctors);
    }




}
