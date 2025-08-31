public class Main {

    // Function to print "Welcome to Data Structures" n times
    public static void print(int n) {
        if (n <= 1) return;

        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.println("Welcome to Data Structures");
                break;  // Ensures inner loop runs only once per outer iteration
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;  // You can change this value to test different inputs
        print(n);
    }
}
