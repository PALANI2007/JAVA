import java.util.Scanner;

public class add {
    public static void main (String args[])
    {

    System.out.println("Enter num 1:");
    Scanner a1 = new Scanner(System.in);
    int a = a1.nextInt();

    System.out.println("Enter num 2:");
    Scanner a2 = new Scanner(System.in);
    int  b  = a2.nextInt();

    int c = a+b;

    System.out.println("The add value is : "+c);
    }

}
