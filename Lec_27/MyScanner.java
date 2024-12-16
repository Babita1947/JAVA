import java.util.*;

public class MyScanner { // Renamed the class
    public static void main(String[] args) {
        System.out.print("Enter your name & age: ");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
