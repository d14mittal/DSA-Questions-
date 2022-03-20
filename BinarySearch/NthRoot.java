// package BinarySearch;

import java.util.Scanner;

public class NthRoot {
    //use binary exponentiation instead of this
    static double multiply(double mid,int n){
        double ans=1.0;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
        }
        return ans;
    }
    static void findNthroot(int n,int m){
        double low=1;
        double high=m;
        double eps=1e-6;
        

        while((high-low)>eps){
            double mid=low+(high-low)/2.0;
            if(multiply(mid, n)<m){
                low=mid;
            }
            else {
                high=mid;
            }
        }
        //high or low as both are equal
        System.out.println(low+" "+high);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        findNthroot(n, m);
    }

    
}
