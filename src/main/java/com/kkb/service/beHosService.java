package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.BehospitalMapper;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.HosregisterMapper;
import com.kkb.pojo.*;
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
public class beHosService {

    @Resource
    private DoctorMapper doctorMapper;

    @Resource
    private BehospitalMapper behospitalMapper;

    @Resource
    private HosregisterMapper hosregisterMapper;

    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Behospital> queryByPage(Integer pageNum, QueryHosVO vo) {
        BehospitalExample hosregisterExample = new BehospitalExample();
        BehospitalExample.Criteria criteria = hosregisterExample.createCriteria();
        PageHelper.startPage(pageNum, 5);
        List<Behospital> behospitals = behospitalMapper.selectByExample(hosregisterExample);
        behospitals.forEach(behospital -> {
            behospital.setHosregister(hosregisterMapper.selectByPrimaryKey(behospital.getBeH_id()));
            behospital.getHosregister().setDoctor(doctorMapper.selectByPrimaryKey(behospital.getHosregister().getD_id()));
        });
        return new PageInfo<>(behospitals);
    }

    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Behospital queryById(Integer beH_id){
        Behospital behospital = behospitalMapper.selectByPrimaryKey(beH_id);
        behospital.setHosregister(hosregisterMapper.selectByPrimaryKey(beH_id));
        behospital.getHosregister().setDoctor(doctorMapper.selectByPrimaryKey(behospital.getHosregister().getD_id()));
        return behospital;
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer updateBeHos(Behospital behospital){
        return behospitalMapper.updateByPrimaryKeySelective(behospital);
    }
}
