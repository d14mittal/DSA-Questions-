import java.util.*;
public class SetsOfEqualSum {
    public static void main(String ar[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        if(sum%2==0)
        {
            System.out.println("is possible");
        }
  }
    
}