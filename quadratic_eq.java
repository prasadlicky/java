package hlo;
import java.util.*;
public class quadratic_eq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double r1,r2,r;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		r=Math.sqrt((b*b)-4*a*c);
		r1=(-b+r)/(2*a);
		System.out.println(r1);
		r2=(-b-r)/(2*a);
		System.out.println(r2);
		

	}

}
