package hlo;
/*
import java.util.*;
public class stock_span {
    public static void getspan(int curr_price,List<Integer> prices){
        int curr_span=1;
        int s=prices.size();
        for(int i=s-1;i>=0;i--){
            if(prices.get(i)<=curr_price) curr_span+=1;
            else break;
        }
        System.out.print(curr_span+" ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> prices=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            getspan(num,prices);
            prices.add(num);
        }
    }
}

import java.util.*;
public class stock_span {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	List<Integer>prices=new ArrayList<>();
	for(int i=0;i<n;i++){
		int num=sc.nextInt();
		getspan(num,prices);
		prices.add(num);
	}
}
public static void getspan(int curr_price,List<Integer> prices)	{
	int curr_span=1;
	int s=prices.size();
	for(int i=s-1;i>=0;i--){
		if(prices.get(i)<=curr_price){
			curr_span+=1;
		}
		else break;
	}
	System.out.print(curr_span+" ");
}
}*/
import java.util.*;
public class stock_span {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	List<Integer>prices=new ArrayList<>();
	for(int i=0;i<n;i++){
		int num=sc.nextInt();
		getspan(num,prices);
		prices.add(num);
	}
}
	public static void getspan(int curr_price,List<Integer>prices){
		int curr_span=1;
		int s=prices.size();
		for(int i=s-1;i>=0;i--){
			if(curr_price>=prices.get(i)){
				curr_span+=1;
				
			}
			else break;
		}
		System.out.println(curr_span+" ");
	}
}









