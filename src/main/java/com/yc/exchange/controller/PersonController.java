package com.yc.exchange.controller;

import com.yc.exchange.service.PersonService;
import com.yc.exchange.vo.AjaxResult;
import com.yc.exchange.vo.PersonInfo;
import com.yc.exchange.vo.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 10097
 */
@RestController
public class PersonController extends BaseController {

    @Autowired
    private PersonService personService;

    @GetMapping("getPoliceList")
    public TableDataInfo getPoliceList(@RequestParam String name , @RequestParam String code)
    {
        List<PersonInfo> persons = personService.getPoliceList(name, code);

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
