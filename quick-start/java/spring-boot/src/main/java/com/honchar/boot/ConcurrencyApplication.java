package com.honchar.boot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/28/2022
 */
@SpringBootApplication
public class ConcurrencyApplication {

    private static final Logger logger = LogManager.getLogger(ConcurrencyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConcurrencyApplication.class, args);
        logger.info("IT WORKS!!!");
    }

}
