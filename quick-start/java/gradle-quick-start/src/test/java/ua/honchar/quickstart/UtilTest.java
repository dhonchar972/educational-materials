package ua.honchar.quickstart;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/28/2022
 */
public class UtilTest {

    private static final Logger logger = LoggerFactory.getLogger(UtilTest.class);

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        logger.info("All good!");
    }

}