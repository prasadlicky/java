package hlo;
/*
import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        for(int i:even){
            System.out.print(i+" ");
        }
        for(int i:odd){
            System.out.print(i+" ");
        }
    }
}*/
import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();
        for(int i=0;i<n;i++){
        	int num=sc.nextInt();
        	if (n%2==0){
        		even.add(num);
        	}
        	else{
        		odd.add(num);
        	}
        }
        for(int i:even){
        	System.out.println(i+" ");
        	
        }
        for(int i:odd){
        	System.out.println(i+" ");
        }
    }
    }