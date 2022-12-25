package org.example.test2;

import org.example.test1.TestClassOne;

class TestClassTwo extends TestClassOne {
    public double d;
    @Override
    protected void protectedMethod() {
        d = super.dou + 1;
    }
}
