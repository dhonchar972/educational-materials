package com.honchar.concurrency.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/28/2022
 */
@RestController
@RequestMapping("/api")
public class BaseController {

    private static final Logger logger = LogManager.getLogger(BaseController.class);

    @GetMapping("/test") // http://localhost:8080/api/test
    public String testLogLevel() {
        logger.trace("This is a TRACE log");
        logger.debug("This is a DEBUG log");
        logger.info("This is an INFO log");
        logger.error("This is an ERROR log");

        return "Added some log output to console...";
    }
}
