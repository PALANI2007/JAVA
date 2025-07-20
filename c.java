import java.util.Scanner;
public class c {
    public static void main(String []args)
    {
       Scanner scan = new Scanner(System.in);
       String name = scan.nextLine();
       int age = scan.nextInt();
       System.out.println("Your name is : "+name);
       System.out.println("Your age is : "+age);
    }
}