package hlo;

import java.util.*;
class equilibrium{
   public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
         sum+=arr[i];
      }
      int no=0,m,k=sum,p;
      for(int i=0;i<n;i++)// p is diff  // m is right sum //n0 left sum
    	//k is for storing    
      {
         no=arr[i]+no;
         m=sum-no;
         p=m-no;
         if(p<0)
         {
            break;
        }
         if(p<k && p>=0)
         {
            k=m-no;
        }
      }
   System.out.println(k);
       
   }
}