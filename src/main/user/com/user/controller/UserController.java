package com.user.controller;

import com.user.model.LogisticsAssignRules;
import com.user.model.LogisticsAssignRulesMapper;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "logisticsAssignRulesMapper")
    private LogisticsAssignRulesMapper logisticsAssignRulesMapper;

    @RequestMapping("/testControllerIsUserful")
    public void testControllerIsUserful(){
        System.err.println("testControllerIsUserful");
        LogisticsAssignRules logisticsAssignRules = new LogisticsAssignRules();
        logisticsAssignRules.setUsername("222");
        logisticsAssignRulesMapper.insert(logisticsAssignRules);

    }

}
