package com.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ZookeeperService {

    public String ping(Map<String,Object> param){

        System.out.println("----------");

        param.forEach((k,v) ->{
            System.out.println("k =" + k + ",v = " + v);
        });

        System.out.println("----------");

        return "ping --- ";
    }
}
