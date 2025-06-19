package hlo;

import java.util.*;

public class stackperm {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] input=new int[n];
		int[] output=new int[n];
		for(int i=0;i<n;i++){
			input[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			output[i]=sc.nextInt();
		}
		int pointer=0;
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++){
			st.push(input[i]);
			while(!st.isEmpty()&&st.peek()==output[pointer]){
				st.pop();
				pointer+=1;
			}
		}
		if(st.isEmpty()){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
