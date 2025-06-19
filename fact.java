package practice;
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        
        // Calculate factorials
        long factorialN = factorial(n);
        long factorialM = factorial(m);
        
        // Compute the result
        long result = factorialN / factorialM;
        
        // Print the result
        System.out.println(result);
    }
    
    // Method to compute factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}