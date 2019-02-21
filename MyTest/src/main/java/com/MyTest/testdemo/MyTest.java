package com.MyTest.testdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyTest {

    @RequestMapping("/mytest")
    public String mytest(){
        return "success";
    }
}
