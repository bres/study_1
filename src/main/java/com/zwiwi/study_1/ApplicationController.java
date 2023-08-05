package com.zwiwi.study_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String Home(){
        return "index";
    }

    @GetMapping("/widgets")
    public String Widgets(){
        return "widgets";
    }

}
