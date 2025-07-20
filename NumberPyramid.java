public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) { // Outer loop for number of rows
            for (int j = i; j < n; j++) { // Inner loop for leading spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // Inner loop for numbers
                System.out.print(k + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
