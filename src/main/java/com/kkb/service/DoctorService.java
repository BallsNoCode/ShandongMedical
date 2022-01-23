package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.DoctorExample;
import com.kkb.pojo.Hosregister;
import com.kkb.vo.QueryDoctorVO;
import com.kkb.vo.QueryHosVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author APPDE
 */
@Service
public class DoctorService {

    @Resource
    private DoctorMapper doctorMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Doctor> queryByPage(Integer pageNum, QueryDoctorVO vo) {
        DoctorExample example = new DoctorExample();
        DoctorExample.Criteria criteria = example.createCriteria();
        if (vo.getD_id() != null) {
            criteria.andD_idEqualTo(vo.getD_id());
        }
        if (vo.getD_keshi() != null && !"".equals(vo.getD_keshi().trim())) {
            criteria.andD_keshiLike("%" + vo.getD_keshi().trim() + "%");
        }
        if (vo.getD_name() != null && !"".equals(vo.getD_name().trim())) {
            criteria.andD_nameLike("%" + vo.getD_name().trim() + "%");
        }
        PageHelper.startPage(pageNum, 5);
        List<Doctor> doctors = doctorMapper.selectByExample(example);
        return new PageInfo<>(doctors);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Doctor queryById(Integer d_id) {
        return doctorMapper.selectByPrimaryKey(d_id);
    }


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer updateDoc(Doctor doctor) {
        return doctorMapper.updateByPrimaryKeySelective(doctor);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer insertDoc(Doctor doctor) {
        doctor.setD_inTime(new Date());
        return doctorMapper.insert(doctor);
    }


}
