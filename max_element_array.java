package practice;
import java.util.*;
public class max_element_array {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	int max=arr[0];
	for(int j=1;j<arr.length;j++){
		if(arr[j]>max){
			max=arr[j];
		}
		
	}
	System.out.println(max);
}
}

