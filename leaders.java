package hlo;
import java.util.*;
class leaders{
		public static void main (String[] args){
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			int []arr=new int[n];
			// giving length of array
			  
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				
				//for insertion values in array
			}
			for (int i=0;i<n;i++){
				//System.out.print(arr[i]);
				//printing values
			}
			leaderMethod(arr,n);
			}


			static void leaderMethod(int arr[], int n ){
			int max= arr[n-1];
			System.out.println(" ");
			System.out.print(max);
			for(int i=n-1;i>=0;i--){
				if (arr[i]>max){
					max=arr[i];
					
					System.out.print(max);
				}
				
			}
			}
			}