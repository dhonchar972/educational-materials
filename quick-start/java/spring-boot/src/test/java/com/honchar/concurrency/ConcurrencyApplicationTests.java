package com.honchar.concurrency;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/28/2022
 */
@SpringBootTest
class ConcurrencyApplicationTests {

	private static final Logger logger = LogManager.getLogger(ConcurrencyApplicationTests.class);

	@Test
	void contextLoads() {
		assertTrue(true);
		logger.info("All good!");
	}

}