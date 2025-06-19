package hlo;
import java.util.*;
public class greatest_number {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		
		System.out.print("enter a: ");
		a=sc.nextInt();
		System.out.print("enter b: ");
		b=sc.nextInt();
		System.out.print("enter c: ");
		c=sc.nextInt();
		
		if (a>b&&b>c)
			System.out.println(a);
		else if (b>c)
			System.out.println(b);
		else 
			System.out.println(c);

	}

}
//for smallest change the signs