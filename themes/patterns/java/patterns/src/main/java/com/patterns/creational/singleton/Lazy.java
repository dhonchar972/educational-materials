package com.patterns.creational.singleton;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Lazy {
    private static volatile Lazy lazy;

    private Lazy() { }

    public static Lazy getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }

    public void printText() {
        System.out.println("Lazy singleton working!");
    }
}
