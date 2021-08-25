// import jdk.nashorn.internal.parser.Scanner;
import java.util.*;

public class SecondLargestNo{
    public static void main(String[] args) {
        int a[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
             a[i]=sc.nextInt();
        }
        int max=a[0];
        int secmax=Integer.MIN_VALUE;
        for(int i=1;i<6;i++){
            if(a[i]>max){
                secmax=max;
                max=a[i];
            }
            if(a[i]<max){
                if(a[i]>secmax || secmax==Integer.MIN_VALUE){
                    secmax=a[i];
                }
            }
        }
        System.out.println(secmax);        
    }
}