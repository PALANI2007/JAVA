import java.util.Scanner;

public class find {
    void evenorodd(int num)
    {
        if(num%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.print("odd number");
        }
        
    }
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int number = Scan.nextInt();
        find obj1 = new find();
        obj1.evenorodd(number);
        
        
    }
}
