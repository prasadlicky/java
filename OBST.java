//21BCE7080
//B.LVS PRASAD
//OPTIMAL BINARY SEARCH TREE

package hlo;
import java.util.Scanner;
public class OBST {
public static void main(String[] args) {
	System.out.println("21bce7080");
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of keys:");
int n = scanner.nextInt();
double[] keys = new double[n + 1];
double[] freq = new double[n + 1]; 
System.out.println("Enter the keys:");
for (int i = 1; i <= n; i++) {
keys[i] = scanner.nextDouble();
}
System.out.println("Enter the frequencies:");
for (int i = 1; i <= n; i++) {
freq[i] = scanner.nextDouble();
}
double[][] dp = new double[n + 2][n + 1]; 

double[][] cost = new double[n + 2][n + 1]; 

for (int i = 1; i <= n; i++) {
dp[i][i - 1] = 0;
dp[i][i] = freq[i];
cost[i][i] = freq[i];
}
// Calculating the cost and optimal BST
for (int len = 1; len <= n; len++) {
for (int i = 1; i <= n - len + 1; i++) {
int j = i + len - 1;
dp[i][j] = Double.MAX_VALUE;
cost[i][j] = cost[i][j - 1] + freq[j];
for (int k = i; k <= j; k++) {
double temp = dp[i][k - 1] + dp[k + 1][j] + cost[i][j];
if (temp < dp[i][j])
dp[i][j] = temp;
}
}
}
System.out.println("The cost of the optimal binary search tree is: " + dp[1][n]);
scanner.close();


}}
