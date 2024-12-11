class A{
    int a;
    A(int x){
        a = x;
        System.out.println("a = "+x);
        System.out.println("A");
    }
}
class B extends A{
    B(){
        super(3);
        System.out.println("B");
    }
}
public class Constructor_in_inheritance {
    public static void main(String[] args){
        B obj = new B();
    }
}
