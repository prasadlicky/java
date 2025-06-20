package practice;

class knapsack{
    static int max(int a,int b){
        return (a>b)?a:b;
    }
    static int knapsack(int w,int wt[],int val[],int n){
        if(n==0||w==0){
            return 0;
        }
        if(wt[n-1]>w){
            return knapsack(w,wt,val,n-1);
        }
        else{
            return max(val[n-1]+knapsack(w-wt[n-1],wt,val,n-1),knapsack(w, wt, val, n-1));
        }
    }
    public static void main(String[] args) {
        int profit[]=new int[]{60,100,120};
        int weight[]=new int[]{10,20,30};
        int w=50;
        int n=profit.length;
        System.out.println(knapsack(w, weight, profit, n));

    }
}