//21BCE7080
//SIVA PRASAD
package hlo;
import java.util.*;
public class MATRIX_ORDER {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of matrices: ");
    int n = scanner.nextInt();
    int[] dimensions = new int[n + 1];
    System.out.println("Enter the dimensions of matrices:");
    for (int i = 0; i <= n; i++) {
        System.out.print("Dimension " + (i + 1) + ": "); dimensions[i] = scanner.nextInt();
        }
int result = multiplyChain(dimensions); System.out.println("Minimum number of multiplications: " + result);
scanner.close();
}
static int multiplyChain(int[] dimensions) {
int n = dimensions.length - 1; int[][] dp = new int[n][n];
for (int len = 2; len <= n; len++) { for (int i = 0; i < n - len + 1; i++) {
int j = i + len - 1;
dp[i][j] = Integer.MAX_VALUE; for (int k = i; k < j; k++) {
int cost = dp[i][k] + dp[k + 1][j] + dimensions[i] * dimensions[k + 1] * dimensions[j + 1];
if (cost < dp[i][j]) {
dp[i][j] = cost;
}
}
}
}
return dp[0][n - 1];
}
}