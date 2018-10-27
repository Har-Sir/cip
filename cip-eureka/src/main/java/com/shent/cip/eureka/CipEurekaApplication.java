package com.shent.cip.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description：
 * @Author： Har
 * @Create： 2018-10-27 15:18
 **/
@EnableEurekaServer
@SpringBootApplication
public class CipEurekaApplication {
    static Logger logger= LoggerFactory.getLogger(CipEurekaApplication.class);

    public static void main(String[] args){
        logger.debug("CipEurekaServer开始启动");
        SpringApplication.run(CipEurekaApplication.class,args);
    }
}
