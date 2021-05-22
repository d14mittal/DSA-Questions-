package ApnaCollege;
import java.util.*;
public class SelectionSort {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int minindex=i;
            boolean sorted=true;
            for(j=i;j<n;j++)
            {
                if(a[j]<a[minindex])
                    minindex=j;
            }
            int temp=a[minindex];
            a[minindex]=a[i];
            a[i]=temp;
            sorted=false;
            if(sorted)
                break;
        }
        for(int r:a)
            System.out.print(r+" ");
    }    
}
