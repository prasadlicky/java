package hlo;
/*
import java.util.*;
public class permcomb {
	public static int fact(int n){
		if(n==0||n==1){
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int perm=fact(n)/(fact(n-r));
		int comb=fact(n)/(fact(n-r)*fact(r));
		System.out.println(perm+" "+comb);
	}
}

import java.util.*;
public class permcomb{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int perm=fact (n)/fact(n-r);
		int comb=fact(n)/fact(n-r)*fact (r);
		System.out.println(perm+" "+comb);
}
	public static int fact(int n){
		if(n==0||n==1){
			return 1;
		}
		return(n*fact(n-1));
	}
}*/

import java.util.*;
public class permcomb{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int r=sc.nextInt();
	    int perm=fact(n)/fact(n-r);
	    int comb=fact(n)/fact(n-r)*fact(r);
	    System.out.println(perm+" "+comb);
	}
public static int fact(int n){
	if(n==0||n==1){
		return 1;
	}
	
	return(n*fact(n-1));
	
}
}



