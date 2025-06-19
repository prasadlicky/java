package hlo;
import java.lang.*;
public class interger {
	public static void main(String args[]){
		System.out.println("min value"+ Integer.MIN_VALUE);
		System.out.println("min value"+ Integer.MAX_VALUE);
		System.out.println("BYTE value"+ Integer.BYTES);
		int x=5;
		int y=-5;
		System.out.println( Integer.toBinaryString(x)); //to binary
		System.out.println( Integer.toBinaryString(y)); //to binary
		for (char c=65;c<=97;c++)  //printing alphabets
		{  
			System.out.print(c + " ");
			
		}
		for (char m=0x0900;m<=0x0970;m++)  //printing alphabets
		{  
			System.out.print(m+" ");
			
		}
	}

}
