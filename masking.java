package hlo;

public class masking {
	public static void main(String args[]){
		byte c;
		byte a=9;
		byte b=12;
		
		c= (byte)(a<<4);
		c=(byte)(c|b);
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));
	}

}
