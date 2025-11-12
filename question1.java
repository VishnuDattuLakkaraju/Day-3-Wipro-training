import java.util.Scanner;

public class Person {
   
    String name;
    int age;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        String name = sc.nextLine();
        int age = sc.nextInt();

        
        Person p = new Person();
        p.name = name;
        p.age = age;

       
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);

        sc.close();
    }
}
