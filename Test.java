public class Test{
    private int x;

    //initialization block
    {
        System.out.println("Initialisation Block: x = "+x);
        x = 5;
    }
    
    //Constructor
    public Test(){
        System.out.println("Constructor: x = "+x);
    }

    public static void main(String[] args){
        Test t1 = new Test();
        //Test t2 = new Test();

        System.out.println("x = "+t1.x);
    }
}