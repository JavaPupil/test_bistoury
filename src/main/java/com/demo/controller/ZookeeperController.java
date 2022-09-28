package com.demo.controller;

import com.demo.service.ZookeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/zookeeper")
public class ZookeeperController {

    @Autowired
    private ZookeeperService zookeeperService;

    @RequestMapping("/ping")
    public String ping(@RequestParam Map<String,Object> param){
        return zookeeperService.ping(param);
    }


}
