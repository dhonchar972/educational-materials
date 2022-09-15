package com.patterns.behavioral.command.commands;

import java.util.Stack;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
