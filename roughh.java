package hlo;
import java.util.*;
public class roughh{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(count==arr[j]){
					count++;
				}
				if (count>=n/2){
					System.out.println(arr[i]);
					break;
				}
				else
					count=0;
			}
		}
		
			
		}
	}

	/**
	static int paths(int n,int k){
		if (n==1 || k==1){
			return 1;
		}
		else{
			return(paths(n-1,k)+paths(n,k-1));
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(paths(n,k));
	}
}/**

	static int main(int n,int k){
		if(n==1){
			return 1;
		}
		else{
			return(main(n-1,k)+k-1)%n+1;
		}
	
	}
	public static void main(String[]args ){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(main(n,k));
	}}
	/**
}
	public static void main (String[] args){
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
		}
		int n0=0,m,k=sum,p;{
			for(int i=0;i<n;i++){
				 n0=arr[i]+n0;
			     m=sum-n0;
				 p=m-n0;
			
				if (p<0){
					break;
				}
				if(p<k && p>=0){
					k=m-n0;
					
				}
			System.out.println(k);
				
			}
		}
	}
	
}
	/**
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


	/**public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int arr[]=new int [n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
		}
		
		int n0=0,m,k=sum,p;
		for(int i=0;i<n;i++){
			n0=arr[i]+n0;
			m=sum-n0;
			p=m-n0;
			if (p<0){
				break;
			}
			if(p<k &&p>=0);
			{
				k=m-n0;
			}
			}
	System.out.println(k);	
	}
}


	/**static void com(int a[],int n, int r ,int index,int c[],int i){
		if(index==r){
			for (int j=0;j<r;j++){
				System.out.println(c[j]+" ");
			System.out.println(" ");
			return;
		}
		if(i>=n);
		    return;
		c[index]=a[i];
		com(a,n,r,index+1,c,i+1);
		com(a,n,r,index,c,i+1);
		}
	}
	static void pc(int arr[],int n, int r){
		int c[]=new int[r];
		com(arr,n,r,0,c,0);
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			int r=sc.nextInt();	
			pc(arr,n,r);
		}
		
		
	}
}
			/**
		}
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
				
				}
				
			}
			if(count>n/2){
				System.out.println(arr[i]);
				break;
				
			}
			else count=0;
		}
	}
}

	/**public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		int no=0,m,k=sum,p;
		for(int i=0;i<n;i++){
			no=arr[i]+no;
			m=sum-no;
			p=m-no;
			if(p<0){
				break;
			}
			if (p<k && p>=0){
				k=m-no;
			}
		}
	System.out.println(k);
		}}
	


/**	static int paths(int n,int k)
{
	if (n==1 ||k==1)
		return 1;
	else
		return (paths(n-1,k)+ paths(n,k-1));
	
	
}
public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int k =sc.nextInt();
	System.out.println(paths(n,k));
}
}

public static void main (String args[]){
Scanner sc= new Scanner(System.in);
int arr[]={2,4,5,6};
for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]);
}
for(int x:arr){
	System.out.print(x); //easy for accessing elements
}
}}



public static void main (String args[]){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
//System.out.println("");
int arr[]=new int[n];
for (int i=0;i<=n;i++){
	System.out.print(i);
}

}}

public static void main (String args[]){

Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int[n];
for (int i=0;i<=n;i++){
	System.out.print(" ");
	System.out.print(i);
}

}

}



public static void main (String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
// giving length of array
 * 
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	
	//for insertion values in array
}
for (int i=0;i<n;i++){
	System.out.print(arr[i]);
	//printing values
}
leaderMethod(arr,n);
}


static void leaderMethod(int arr[], int n ){
int max= arr[n-1];
System.out.println(max);
for(int i=n-1;i>=0;i--){
	if (arr[i]>max){
		max=arr[i];
		System.out.println(max);
	}
	
}
}
}

**/








