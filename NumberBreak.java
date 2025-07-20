public class NumberBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) { // Loop from 1 to 20
            if (i == 13) { // Check if the number is 13
                break; // Exit the loop if the number is 13
            }
            System.out.println(i); // Print the current number
        }
    }
}
