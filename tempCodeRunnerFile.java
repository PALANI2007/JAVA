import java.util.Scanner;
 public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int number = scanner.nextInt();
 scanner.close();
 try
 {
 checkNumber(number);
 System.out.println("The number is: " + number);
 } catch (IllegalArgumentException e) {
}
 Register No: RTC2024BCS160
 System.out.println("Error: " + e.getMessage());
 }
 public static void checkNumber(int number) {
 if(number < 0) {
 throw new IllegalArgumentException("Negative numbers are not allowed");
 }
 }
 }