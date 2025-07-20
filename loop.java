
import java.util.Scanner;

public class loop {
    public static void main(String args[]) {
        System.out.println("Enter array value :");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for(int i=0;i<num;i++)
        {
            System.out.print((i+1)+" element : ");
            int a = scan.nextInt();   
            sum = sum + a;
                 
        } 
        System.out.println(sum); 

          }     
}