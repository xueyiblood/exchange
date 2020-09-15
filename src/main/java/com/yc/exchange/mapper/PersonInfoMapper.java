package com.yc.exchange.mapper;

import com.yc.exchange.vo.PersonInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonInfoMapper {


    List<PersonInfo> getPoliceList();
}
