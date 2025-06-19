package hlo;
import java.util.*;
public class manver {
static int numberOfPaths(int n,int k)
    {
        if(n == 1 || k == 1)
        return 1;
        else
        return numberOfPaths(n-1,k)+numberOfPaths(n,k-1);
    }
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(numberOfPaths(n,k));
        
    }
}