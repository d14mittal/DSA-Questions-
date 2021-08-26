package BinarySearch;

import java.util.Scanner;

public class MaxElementlessThan9 {

    static int maxlessthan9(int a[],int n){
        int ans = -1;
        int low = 0, high=
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid]<n) {
                ans = mid;
                low = mid + 1;            
            } 
            else if (a[mid]>n) {
                high=mid-1;
            } 
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]=new int[8];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i++){
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        System.out.println(maxlessthan9(a, n));
    }
}
