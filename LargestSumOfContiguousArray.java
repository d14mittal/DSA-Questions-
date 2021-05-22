import java.util.*;
public class LargestSumOfContiguousArray {
    public static void main(String arr[]){
    // {
    //     long startTime = System.currentTimeMillis();
    //     int n,i;
        Scanner sc=new Scanner(System.in);
    //     n=sc.nextInt();
    //     int a[]=new int[n];
    //     for(i=0;i<n;i++)
    //     {
    //         a[i]=sc.nextInt();
    //     }
    //     System.out.println("Max sum of subarray is "+largestsum(a));
    //     long stopTime = System.currentTimeMillis();
    //   long elapsedTime = stopTime - startTime;
    //   System.out.println(elapsedTime);

    // }
    // static int largestsum(int ar[])
    // {
    //     int n=ar.length;
    //     int max_end_here=0;
    //     int max_so_far=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         max_end_here=max_end_here+ar[i];
    //         if(max_end_here>max_so_far){
    //             max_so_far=max_end_here;
    //         }
    //         if(max_end_here<0){
    //             max_end_here=0;
    //         } 
    //     }
    //     return max_so_far;
    // }
    int i;
    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int max_end_here=a[0];
		    int max_so_far=a[0];
		    for(i=1;i<n;i++)
		    {
		        
		        if(a[i]>max_end_here+a[i])
		        {
		            max_end_here=a[i];
                }
                else
                {
                    max_end_here=max_end_here+a[i];
                }
		        // max_end_here=Math.max(max_end_here+a[i],a[i]); for above
		        
		        // max_so_far=Math.max(max_so_far,max_end_here); for below
		        if(max_end_here>max_so_far)
		        {
		        max_so_far=max_end_here;
		        }
		    }
		    
        System.out.println(max_so_far);
        }
}