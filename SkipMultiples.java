public class SkipMultiples {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) { 
            if (i % 5 == 0) { 
                continue; 
            }
            System.out.println(i); 
        }
    }
}
