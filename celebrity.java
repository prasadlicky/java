package hlo;
/*
import java.util.Scanner;
public class celebrity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] in=new int[n];
        int[] out=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=sc.nextInt();
                if(temp==1){
                    out[i]+=1;
                    in[j]+=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(out[i]==0 && in[i]==n-1){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("No Celebrity");
    }
}
/*
import java.util.*;
public class celebrity {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int in[]=new int[n];
    	int out[]=new int[n];
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			int temp=sc.nextInt();
    			if (temp==1){
    				out[i]+=1;
    				in[j]+=1;
    			}
    		}
    	}
    	for(int i=0;i<n;i++){
    		if(out[i]==0 && in[i]==n-1){
    			System.out.println(i+1);
    			return;
    		}
    	}
    	System.out.println("no celeb");
    }
    }*/






import java.util.*;
public class celebrity{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int in[]=new int[n];
		int out[]=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int temp=sc.nextInt();
				if(temp==1){
					out[i]+=1;
					in[j]+=1;
				}
			}
		
		
		}
		for(int i=0;i<n;i++){
			if( out[i]==0&&in[i]==n-1){
				System.out.println(i+1);;
				return;
			}
		}
		System.out.println("no");
	}
}