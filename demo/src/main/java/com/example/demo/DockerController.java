package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DockerController {
    @RequestMapping(value="/test")
    @ResponseBody
        public Docker greeting() {
//        return "Docker";
//        List<Docker> docker = new ArrayList<>();

       return new Docker("Docker" , "Run");
//        return docker ;
    }
}
