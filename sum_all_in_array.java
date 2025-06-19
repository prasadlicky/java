package practice;
import java.util.*;
public class sum_all_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			
		
		arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<arr.length;j++){
			sum+=arr[j];
			
			
		}
		System.out.println(sum);

	}

}
