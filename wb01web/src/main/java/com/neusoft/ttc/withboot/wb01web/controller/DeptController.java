package com.neusoft.ttc.withboot.wb01web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/d")
public class DeptController {
    @GetMapping("/t")
    public String test(){
        return "OK";
    }
}
