package com.dmg.milvuslearn.controller;

import javax.annotation.Resource;

import com.dmg.milvuslearn.service.MyTestServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class MyTestController {

    @Resource
    private MyTestServiceImpl myTestService;

    @GetMapping("/insertVertexAndEdge")
    public void insertVertexAndEdge() {
        System.out.println("test");
    }
}


