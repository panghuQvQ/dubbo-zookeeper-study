package com.wang.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;


@Service // 注册到容器中
public class UserService {

    /**
     * 想拿到provider提供的票,要去注册中心拿到服务
     * 引用, 方法一：项目中引入POM坐标，
     *      方法二：定义路径相同的接口名
     */
    @DubboReference
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心中拿到"+ticket);
    }

}
