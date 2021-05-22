import java.util.*;
public class bubblesort{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,temp;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            boolean sorted=true;
            for(j=0;j<n-1-i;j++) 
            {
                if(a[j+1]<a[j])                                         
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    sorted=false;
                }
            }
            if(sorted)
            {
                break;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }


    }

}