package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.HosregisterMapper;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.DoctorExample;
import com.kkb.pojo.Hosregister;
import com.kkb.pojo.HosregisterExample;
import com.kkb.vo.HosResultVO;
import com.kkb.vo.QueryHosVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author APPDE
 */
@Service
public class hosService {

    @Resource
    private HosregisterMapper hosregisterMapper;
    @Resource
    private DoctorMapper doctorMapper;

    private HosregisterExample hosregisterExample = new HosregisterExample();
    private DoctorExample doctorExample = new DoctorExample();
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<HosResultVO> queryByPage(Integer pageNum, Integer pageSize, QueryHosVO vo){

        HosregisterExample.Criteria hosregisterExampleCriteria = hosregisterExample.createCriteria();

        DoctorExample.Criteria doctorExampleCriteria = doctorExample.createCriteria();
/*        if (vo.getHosR_id() != null){
            hosregisterExampleCriteria.andHosR_idEqualTo(vo.getHosR_id());
        }
        if (vo.getD_name() != null && !"".equals(vo.getD_name().trim())){
            doctorExampleCriteria.andD_nameEqualTo(vo.getD_name());
            List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
            Integer d_id = doctors.get(0).getD_id();
            hosregisterExampleCriteria.andD_idEqualTo(d_id);
        }
        if (vo.getD_keshi() != null && !"".equals(vo.getD_keshi().trim())){

        }
        if (vo.getBeginDate() != null) {
            hosregisterExampleCriteria.andHosR_timeGreaterThanOrEqualTo(vo.getBeginDate());
        }
        if (vo.getEndDate() != null) {
            hosregisterExampleCriteria.andHosR_timeLessThanOrEqualTo(vo.getEndDate());
        }*/
        PageHelper.startPage(pageNum, pageSize);
        List<Hosregister> hosregisters = hosregisterMapper.selectByExample(hosregisterExample);
        List<HosResultVO> results = new ArrayList<>();
        hosregisters.forEach(hosregister -> {
            Integer d_id = hosregister.getD_id();
            Doctor doctor = doctorMapper.selectByPrimaryKey(d_id);
            HosResultVO hosResultVO = new HosResultVO();
            hosResultVO.setHosR_id(hosregister.getHosR_id());
            hosResultVO.setD_name(doctor.getD_name());
            hosResultVO.setD_keshi(doctor.getD_keshi());
            hosResultVO.setHosR_time(hosregister.getHosR_time());
            hosResultVO.setHosR_state(hosregister.getHosR_state());
            results.add(hosResultVO);
        });
        return new PageInfo<>(results);
    }

    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public HosResultVO queryLook(Integer HosR_id) {
        Hosregister hosregister = hosregisterMapper.selectByPrimaryKey(HosR_id);
        HosResultVO hosResultVO = new HosResultVO();
        hosResultVO.setHosR_name(hosregister.getHosR_name());
        hosResultVO.setHosR_idCard(hosregister.getHosR_idCar());
        hosResultVO.setHosR_regPrice(hosregister.getHosR_regPrice());
        hosResultVO.setHosR_medical(hosregister.getHosR_medical());
        hosResultVO.setHosR_phone(hosregister.getHosR_phone());
        hosResultVO.setHosR_selfPrice(hosregister.getHosR_selfPrice());
        hosResultVO.setHosR_sex(hosregister.getHosR_sex());
        hosResultVO.setHosR_age(hosregister.getHosR_age());
        hosResultVO.setHosR_work(hosregister.getHosR_work());
        hosResultVO.setHosR_lookDoctor(hosregister.getHosR_lookDoctor());
        Doctor doctor = doctorMapper.selectByPrimaryKey(hosregister.getD_id());
        hosResultVO.setD_keshi(doctor.getD_keshi());
        hosResultVO.setD_name(doctor.getD_name());
        hosResultVO.setHosR_remark(hosregister.getHosR_remark());
        return hosResultVO;

    }
}
