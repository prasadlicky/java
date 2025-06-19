package hlo;

import java.util.Scanner;
public class combination {
    static void com(int a[],int n,int r,int index,int c[],int i){
    	
        if(index==r){  //if index length is same as req combination length then print combination
            for(int j=0;j<r;j++)
                System.out.print(c[j]+" ");
            System.out.println(" "); //for every combination move to new Line
            return;
        }
        if(i>=n) //no number is there to form the combinations
            return;
        c[index]=a[i];
        com(a,n,r,index+1,c,i+1); //fixing index number and forming combinations
        com(a,n,r,index,c,i+1);
    }
    static void pc(int arr[],int n,int r){
        int c[] = new int[r]; // each combination with length r we will store in c Array
        com(arr,n,r,0,c,0);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);             // scanner input
        
        int n=sc.nextInt();  //length of the Array 
        int arr[]=new int[n]; //Array
        for(int i=0;i<n;i++) 
        	arr[i]=sc.nextInt(); //array elements
        int r=sc.nextInt();  //combinations len
        pc(arr,n,r);
    }
}