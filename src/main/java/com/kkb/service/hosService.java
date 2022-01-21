package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.HosregisterMapper;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.DoctorExample;
import com.kkb.pojo.Hosregister;
import com.kkb.pojo.HosregisterExample;
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
public class hosService {

    @Resource
    private HosregisterMapper hosregisterMapper;
    @Resource
    private DoctorMapper doctorMapper;

    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Hosregister> queryByPage(Integer pageNum,QueryHosVO vo){
        HosregisterExample hosregisterExample = new HosregisterExample();
        HosregisterExample.Criteria hosregisterExampleCriteria = hosregisterExample.createCriteria();
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria doctorExampleCriteria = doctorExample.createCriteria();
        if (vo.getHosR_id() != null) {
            hosregisterExampleCriteria.andHosR_idEqualTo(vo.getHosR_id());
        }
        if (vo.getD_name() != null && !"".equals(vo.getD_name().trim())) {
            doctorExampleCriteria.andD_nameLike("%" + vo.getD_name().trim() + "%");
            List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
            Integer d_id = doctors.get(0).getD_id();
            hosregisterExampleCriteria.andD_idEqualTo(d_id);
        }
        if (vo.getD_keshi() != null && !"".equals(vo.getD_keshi().trim())){
            doctorExampleCriteria.andD_keshiLike("%"+vo.getD_keshi().trim()+"%");
            List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
            doctors.forEach(doctor -> {
                Integer d_id = doctor.getD_id();
                hosregisterExample.or().andD_idEqualTo(d_id);
            });
        }
        if (vo.getBeginDate() != null) {
            hosregisterExampleCriteria.andHosR_timeGreaterThanOrEqualTo(vo.getBeginDate());
        }
        if (vo.getEndDate() != null) {
            hosregisterExampleCriteria.andHosR_timeLessThanOrEqualTo(vo.getEndDate());
        }
        PageHelper.startPage(pageNum,5);
        List<Hosregister> hosregisters = hosregisterMapper.selectByExample(hosregisterExample);
        hosregisters.forEach(hosregister -> {
            Integer d_id = hosregister.getD_id();
            Doctor doctor = doctorMapper.selectByPrimaryKey(d_id);
            hosregister.setDoctor(doctor);
        });
        return new PageInfo<>(hosregisters);
    }

    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Hosregister queryById(Integer HosR_id){
        return hosregisterMapper.selectByPrimaryKey(HosR_id);
    }


    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Hosregister queryLook(Integer HosR_id) {
        Hosregister hosregister = hosregisterMapper.selectByPrimaryKey(HosR_id);
        Doctor doctor = doctorMapper.selectByPrimaryKey(hosregister.getD_id());
        hosregister.setDoctor(doctor);
        return hosregister;
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer quitHos(Integer HosR_id){
        Hosregister hosregister = hosregisterMapper.selectByPrimaryKey(HosR_id);
        hosregister.setHosR_state(3);
        return hosregisterMapper.updateByPrimaryKeySelective(hosregister);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer updateHos(Hosregister hosregister){
        return hosregisterMapper.updateByPrimaryKeySelective(hosregister);
    }


}
