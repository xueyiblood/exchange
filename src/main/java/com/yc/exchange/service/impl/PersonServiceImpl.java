package com.yc.exchange.service.impl;

import com.yc.exchange.mapper.PersonInfoMapper;
import com.yc.exchange.service.PersonService;
import com.yc.exchange.vo.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 10097
 */
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonInfoMapper personInfoMapper;


    @Override
    public List<PersonInfo> getPoliceList(String name ,  String code) {
        return personInfoMapper.getPoliceList();
    }

    @Override
    public void updatePersonInfo() {

    }

    @Override
    public void deletePersonInfo() {

    }


    @Override
    public void addPerson() {

    }

}
