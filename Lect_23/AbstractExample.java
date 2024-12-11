//package Lect_23;

abstract class A {
    int a;

    void f() {
        System.out.println("a = " + a);
    }
    
    abstract void f1(int b); // Declare abstract method
}

class B extends A {
    void f1(int b) { // Provide implementation for the abstract method
        System.out.println("b = " + b);
    }
}

public class AbstractExample { // Rename to AbstractExample
    public static void main(String[] arg) {
        A obj = new B(); // Polymorphic reference
        obj.a = 10;
        obj.f();         // Calls the method from class A
        obj.f1(20);      // Calls the overridden method in class B
    }
}
