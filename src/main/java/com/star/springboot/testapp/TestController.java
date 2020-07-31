package com.star.springboot.testapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/redi")
    public String other(){
        return "redirect:/";
    }

    @RequestMapping(value="/forw")
    public String home(){
        return "forward:/";
    }

}

/*
* redirect: response, request 정보를 새로 생성.
* forward: response, request 정보를 유지.
* */
