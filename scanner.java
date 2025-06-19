package hlo;
import java.lang.*;
import java.util.*;

public class scanner {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		float d;
		double e;
		String name;
		//name=sc.nextLine(); //for multi line name input
		//a=sc.nextInt(); //for integer input 
		//b=sc.nextInt();
		//c=a+b;
		//int z=sc.nextInt();// easy int
	    //String y=sc.next(); //only one word
	    sc.useRadix(2); //binary
	    int w=sc.nextInt();
		
		//System.out.println("hello man " + c + name+ z);
		//System.out.println(y);
		System.out.println(w);
	}


}
