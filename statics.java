public class statics {
    private static int k;
    static{
        System.out.println("Static Initialisation Block: k = "+k);
        k = 10;
    }

    public static void main(String []args){

        System.out.println("k = "+k);
    }
}
