package com.czx.immortal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author : chenzhx
 * @since : 2019/6/15/015
 **/
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
@MapperScan("com.czx.immortal.*.mapper")
public class ImmortalApplication {

    public static void main(String[] args) {
            SpringApplication.run(ImmortalApplication.class, args);
        }

}
