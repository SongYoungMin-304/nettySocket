package com.example.demo.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;

import com.example.demo.server.NettySocketServer;

@Controller
public class NettyController {

    @PostConstruct
    private void start() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                	System.out.println("송영민오영민");
                    //new NettySocketServer(5010).run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }

    @PreDestroy
    private void destory() {

    }
}