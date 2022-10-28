package ua.honchar.concurrency;

import org.apache.logging.log4j.LogManager;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/28/2022
 */
public class Main {

    public static void main(String[] args) {
        final var log = LogManager.getLogger(Main.class);
        log.info("I WORK!!!");
        //System.out.println("I WORK!!!");
    }
}
