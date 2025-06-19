package hlo;
import java.util.*;
import java.util.Scanner;
class perm{
	public static int fib(int n,int []dp){
		if(n==0){
			return dp[0]=0;
		}
		if(n==1){
			return dp[1]=1;
		}
		if(dp[n]!=-1){
			return dp[n];
		}
		return dp[n]=fib(n-1,dp)+fib(n-2,dp);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dp[]=new int[n+1];
		for(int i=0;i<n+1;i++){
			dp[i]=-1;
			System.out.print(fib(i,dp)+" ");
		}
	}
}