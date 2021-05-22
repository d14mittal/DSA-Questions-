import java.util.*;
public class insertionsort {
    public static void main(String ar[])
    {
        int i,j,temp,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<=n-1;i++)
        {
            j=i;
                while(j>0 && a[j-1]>a[j])
                {
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    j--;
                }
            }
        }
        for(int k:a)
        {
            System.out.print(k+ " ");
        }
    
    
    
    
    
    
    
    
    
    }
    
}