package hlo;
import java.util.*;
public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("enter the year: ");
		year =sc.nextInt();
		if (year%4==0){
			if (year%100==0){
				System.out.println("may be a leap year");
				if (year %400==0){
					System.out.println("it is a leap year");
				}
				
				
				else
				{
				    System.out.println("it is not a leap year");
				}
			}
					
		}
				
				
			
			else{
				System.out.println("it is aleap year");
			}
			
			
		
		else
	     {
			System.out.println("not a leap year");
		}
		
	}}


// condition
///*year%4==0 and 100 and 400 leap year
//year %4==0 and %100!=0 leap year
//yaer %4==0 and %100==0 and %400!=0 not a leap year

