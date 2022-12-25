package com.patterns.creational.singleton;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public enum Eager {
    INSTANCE;

    public void doWork() {
        System.out.println("Eager singleton work!");
    }
}
