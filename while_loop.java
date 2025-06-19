package practice;
import java.util.*;
public class while_loop {
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the initial value: ");
	int i=sc.nextInt();
	
	System.out.print("enter the final value: ");
	int n=sc.nextInt();
	
	while(i<n){   //i<n or directly we can write  i<100
		
		System.out.println(i);
		i=i*2;
	}
	
	


}}
// do while loop atleast once it will print