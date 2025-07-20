import java.util.Scanner;
public class sub {
    public static void main(String []args)
    {
        System.out.println("Eneter 1 num: ");
        Scanner palani = new Scanner(System.in);
        int a = palani.nextInt();

        System.out.println("Enter 2 num: ");
        Scanner palanivel = new Scanner(System.in);
        int b = palanivel.nextInt();

        int c = a-b;
        System.out.println("The sub value is : "+c);

    }
}
