package com.wang.service.impl;

import com.wang.service.TicketService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author wzy
 * @version 1.0.0
 * @ClassName TicketServiceImpl.java
 * @Description 服务注册与发现
 * @createTime 2022年05月09日 20:10:00
 */
@DubboService // 可以被扫描到，在项目一启动就自动注册到注册中心
@Component // 使用了Dubbo后不要使用service注解
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "电影票";
    }
}
