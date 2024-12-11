class Parent {
    static int y = 4;
}

class Child extends Parent{
    static{
        y = 5;
    }
}

public class Eg{
    public static void main(String[] args){
        System.out.println("Y = "+Child.y); //Parent class y = 4 value will be printed because Parent replace the Child
    }
}
