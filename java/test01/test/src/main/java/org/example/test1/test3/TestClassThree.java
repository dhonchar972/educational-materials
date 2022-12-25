package org.example.test1.test3;

final class TestClassThree { //package level accessor(class+, subclass-, package+, world-), only current folder(directory)
    private static final boolean bool = true; //private level accessor(class+, subclass-, package-, world-)
    String str = "string"; //package level accessor(class+, subclass-, package+, world-)
    protected double dou = 12.7;  //protected level accessor(class+, subclass+, package+, world-)
    public int integer = 12;  //public level accessor(class+, subclass+, package+, world+)

    private static void privateMethod() {}
    void packageMethod() {}
    protected void protectedMethod() {}
    public final void publicMethod() {}

    private class InnerClass {}
    class InnerPackageClass {}
    protected class InnerProtectedClass {}
    public class InnerPublicClass {}
}
