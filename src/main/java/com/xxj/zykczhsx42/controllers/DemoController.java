package com.xxj.zykczhsx42.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @GetMapping("demo")
    @ResponseBody
    public String demo() {
        System.out.println("demo() executed!");
        return "Hello world";
    }

    @GetMapping("/show")
    public ModelAndView show() {
        return new ModelAndView("demo", "message", "哈喽hello");
    }
}
