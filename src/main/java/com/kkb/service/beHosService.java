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
import java.util.ArrayList;
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

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Behospital> queryByPage(Integer pageNum, QueryHosVO vo) {
        BehospitalExample behospitalExample = new BehospitalExample();
        BehospitalExample.Criteria criteria = behospitalExample.createCriteria();

        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria doctorExampleCriteria = doctorExample.createCriteria();

        HosregisterExample hosregisterExample = new HosregisterExample();
        HosregisterExample.Criteria hosregisterExampleCriteria = hosregisterExample.createCriteria();

        if (vo.getHosR_id() != null) {
            criteria.andBeH_idEqualTo(vo.getHosR_id());
        }
        if (vo.getD_keshi() != null && !"".equals(vo.getD_keshi().trim())) {
            doctorExampleCriteria.andD_keshiLike("%" + vo.getD_keshi().trim() + "%");
            List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
            List<Integer> list = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            doctors.forEach(doctor -> {
                list.add(doctor.getD_id());
            });
            hosregisterExampleCriteria.andD_idIn(list);
            List<Hosregister> hosregisters = hosregisterMapper.selectByExample(hosregisterExample);
            hosregisters.forEach(hosregister -> {
                list2.add(hosregister.getHosR_id());
            });
            criteria.andBeH_idIn(list2);

        }
        if (vo.getD_name() != null && !"".equals(vo.getD_name().trim())){
            doctorExampleCriteria.andD_nameLike("%" + vo.getD_name().trim() + "%");
            List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
            List<Integer> list = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            doctors.forEach(doctor -> {
                list.add(doctor.getD_id());
            });
            hosregisterExampleCriteria.andD_idIn(list);
            List<Hosregister> hosregisters = hosregisterMapper.selectByExample(hosregisterExample);
            hosregisters.forEach(hosregister -> {
                list2.add(hosregister.getHosR_id());
            });
            criteria.andBeH_idIn(list2);
        }
        if (vo.getBeginDate() != null) {
            hosregisterExampleCriteria.andHosR_timeGreaterThanOrEqualTo(vo.getBeginDate());
            List<Hosregister> hosregisters = hosregisterMapper.selectByExample(hosregisterExample);
            List<Integer> list = new ArrayList<>();
            hosregisters.forEach(hosregister -> {
                list.add(hosregister.getHosR_id());
            });
            criteria.andBeH_idIn(list);
        }
        if (vo.getEndDate() != null) {
            hosregisterExampleCriteria.andHosR_timeLessThanOrEqualTo(vo.getEndDate());
            List<Hosregister> hosregisters = hosregisterMapper.selectByExample(hosregisterExample);
            List<Integer> list = new ArrayList<>();
            hosregisters.forEach(hosregister -> {
                list.add(hosregister.getHosR_id());
            });
            criteria.andBeH_idIn(list);
        }

        PageHelper.startPage(pageNum, 5);
        List<Behospital> behospitals = behospitalMapper.selectByExample(behospitalExample);
        behospitals.forEach(behospital -> {
            behospital.setHosregister(hosregisterMapper.selectByPrimaryKey(behospital.getBeH_id()));
            behospital.getHosregister().setDoctor(doctorMapper.selectByPrimaryKey(behospital.getHosregister().getD_id()));
        });
        return new PageInfo<>(behospitals);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Behospital queryById(Integer beH_id) {
        Behospital behospital = behospitalMapper.selectByPrimaryKey(beH_id);
        behospital.setHosregister(hosregisterMapper.selectByPrimaryKey(beH_id));
        behospital.getHosregister().setDoctor(doctorMapper.selectByPrimaryKey(behospital.getHosregister().getD_id()));
        return behospital;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer updateBeHos(Behospital behospital) {
        return behospitalMapper.updateByPrimaryKeySelective(behospital);
    }
}
