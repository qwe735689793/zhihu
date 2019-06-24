package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sch
 * @create 2019/3/29
 * 这是一个测试类！这是一个测试类！这是一个测试类
 */
@Controller
@RequestMapping("/")
public class TestBootController {
    @RequestMapping("getHome")
    public String getHome(ModelMap map) {
        return "Home";
    }


}