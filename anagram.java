package practice;
import java.lang.reflect.Array;
import java.util.*;
public class anagram {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if (c1.length==c2.length){
			Arrays.sort(c1);
			Arrays.sort(c2);	
		}
//		for(int i=0;i<=c1.length;i++){
//			System.out.print(c1[i]);
//		}
//	    	
		//else{
			//System.out.println("not");
	//	}
	for(int i=0;i<c1.length;i++)
	{
	    // for(int j=0;i<c2.length;j++)
	    	 if(c1[i]!=c2[i]){
	    		 System.out.println("not"); 
	    	 }  
	    	 else{
		 System.out.println("anagram");
	    	
	    	 }
	}        
	}
}

