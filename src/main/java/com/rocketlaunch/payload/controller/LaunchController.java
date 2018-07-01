package com.rocketlaunch.payload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LaunchController {

    @GetMapping(path = "/fireup")
    @ResponseBody
    public String fireUp(){
        return "Countdown begins";
    }
}
