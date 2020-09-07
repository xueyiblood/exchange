package com.yc.exchange.controller;

import com.yc.exchange.service.PersonService;
import com.yc.exchange.vo.AjaxResult;
import com.yc.exchange.vo.PersonInfo;
import com.yc.exchange.vo.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 10097
 */
@RestController
public class PersonController extends BaseController {

    @Autowired
    private PersonService personService;

    @PostMapping("getPoliceList")
    public TableDataInfo getPoliceList()
    {
        List<PersonInfo> persons = personService.getPoliceList();

        return getDataTable(persons);
    }

    @PostMapping("addPersonInfo")
    public AjaxResult addPersonInfo()
    {
        personService.addPerson();

        return AjaxResult.success("添加成功");
    }

    @PostMapping("updatePersonInfo")
    public AjaxResult deletePoliceList()
    {
        personService.addPerson();

        return AjaxResult.success("添加成功");
    }

    @PostMapping("deletePersonInfo")
    public AjaxResult deletePersonInfo()
    {
        personService.addPerson();

        return AjaxResult.success("添加成功");
    }

}
