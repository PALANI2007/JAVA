import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            int count = 0;
            for (int temp = number; temp != 0; temp /= 10) {
                count++;
            }
            
            System.out.println("The number of digits in " + number + " is: " + count);
        }
    }
}
