package hlo;
import java.util.*;
public class rough{
	static int main (int n,int k){
		if (n==1)
			return 1;
		else 
			return (main(n-1,k)+k-1)%n+1;
	}
	public static void main (String[] args){
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int k=Sc.nextInt();
		System.out.println(main(n,k));
		
		
	}
}
        