package com.patterns.behavioral.memento.commands;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface Command {
    String getName();
    void execute();
}
