package practice;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int f=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(arr==null){
            System.out.print("-1");
        }
        int res=r*f;
        int sum=0;
        int house=0;
        for(int i=0;i<n;i++){
            sum=arr[i]+sum;
            house++;
            if(sum>=res){
                System.out.print(house);
                break;
            }
        }
	}
}