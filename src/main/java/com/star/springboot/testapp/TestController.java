package com.star.springboot.testapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("msg", "input your id");
        return "index";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String send(@RequestParam("id1") String id, Model model){
        model.addAttribute("msg", "Hi. " + id + "!!");
        model.addAttribute("id2", id);
        return "index";
    }
}
