package practice;
import java.util.*;
public class secnd_largest_ele_array {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	int max1=arr[0];
	int max2=arr[0];
	for(int j=1;j<arr.length;j++){
		if(arr[j]>max1){
			max2=max1;
			max1=arr[j];
			
		}
		else if(arr[j]>max2){
			max2=arr[j];
		}
	}
	
	System.out.println(max2);
}
}

