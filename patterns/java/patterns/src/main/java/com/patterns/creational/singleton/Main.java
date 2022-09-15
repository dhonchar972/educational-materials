package com.patterns.creational.singleton;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    public static void main(String[] args) {
        var lazy = Lazy.getInstance();
        lazy.printText();
        var lazy2 = Lazy.getInstance();
        lazy2.printText();

        var eager = Eager.INSTANCE;
        eager.doWork();
    }
}
