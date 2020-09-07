package com.yc.exchange.service;

import com.yc.exchange.vo.PersonInfo;

import java.util.List;

/**
 * @author 10097
 */
public interface PersonService {
    void addPerson();

    List<PersonInfo> getPoliceList();
}
