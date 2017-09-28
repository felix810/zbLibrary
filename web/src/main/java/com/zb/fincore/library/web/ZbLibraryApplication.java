package com.zb.fincore.library.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * created by fangyang on 2017/9/28 15:27.
 * email:fangyang@zillionfortune.com
 * version:1.0
 * describe:
 */
@SpringBootApplication
@ImportResource("classpath*:spring/spring-basic.xml")
@PropertySource("file:${zbLibrary_conf_path}/env.properties")
public class ZbLibraryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZbLibraryApplication.class, args);
    }
}
