package com.zzy.novel.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * @Description novel-home启动类
 * @Author Zzy
 * @Date 2023/6/20
 */
@SpringBootApplication(scanBasePackages = {"com.zzy.novel"})
@MapperScan("com.zzy.novel.*.dao.mapper")
@EnableCaching
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.zzy.novel.book.feign"})
public class NovelHomeApplication {

}
