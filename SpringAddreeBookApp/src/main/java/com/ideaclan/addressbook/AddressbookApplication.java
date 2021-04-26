package com.ideaclan.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressbookApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AddressbookApplication.class, args);
        log.info("Address Book app started in {} environment..", context.getEnvironment().getProperty("environment"));
        log.info("ADDRESS BOOK DB User is = {} ",context.getEnvironment().getProperty("spring.datasource.username"));
        log.info("ADDRESS BOOK DB password is = {} ",context.getEnvironment().getProperty("spring.datasource.password"));
    }

}
