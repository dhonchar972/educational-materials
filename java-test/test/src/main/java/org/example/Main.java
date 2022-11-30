package org.example;

import org.example.test1.TestClassOne;

public class Main {
    public static void main(String[] args) {
        var test = new TestClassOne();
        // var testInner = new TestClassOne.InnerPublicClass() // must be static
        var testInteger = test.integer;
        test.publicMethod();
    }
}
