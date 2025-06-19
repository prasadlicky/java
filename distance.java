package practice;
import java.lang.Math;
import java.util.*;
public class distance {
	private static final double x1 = 0;

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float x1=sc.nextFloat();
		float x2=sc.nextFloat();
		float x3=sc.nextFloat();
		float y1=sc.nextFloat();
		float y2=sc.nextFloat();
		float y3=sc.nextFloat();
	

	float result1=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
	float result2=(float)Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2, 2));
	float result3=(float)Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1, 2));
	float result4= (float)result1+result2+result3;
	System.out.print(result4);
	}
}
