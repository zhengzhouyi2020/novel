package com.zzy.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * @Description novel-resource启动类
 * @Author Zzy
 * @Date 2023/6/20
 */
@SpringBootApplication(scanBasePackages = {"com.zzy.novel"})
@EnableDiscoveryClient
public class NovelResourceApplication {
}
