package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DockerController {
    @RequestMapping(value="/")
    @ResponseBody
        public Docker greeting() {
//        return "Docker";
//        List<Docker> docker = new ArrayList<>();
        //Run Docker containers on same network and then use container name inplace of IP Address and instead of manually creating network you can use docker-compose.yaml that will connect container by running them on same network
        //Because to communicate between two container they should be on same container
        String uri = "http://container1:8086/test";
        RestTemplate restTemplate = new RestTemplate();
        Docker user = restTemplate.getForObject(uri, Docker.class);
        System.out.println("REST_API called " + user);
       return user;
//        return docker ;
    }
}
