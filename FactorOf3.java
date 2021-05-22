import java.util.*;

public class FactorOf3{
    
    static void PossiblePermutation(int a[],int left,int right)
    {
        int i;
        boolean ispossible=false;

        if(left==right)
        {
            for(i=0;i<a.length-1;i++)
            {
                if((a[i]+a[i+1])%3!=0)
                {
                    ispossible=true;
                }
            }
            
            // if(isdivisible==false)
            // {
            //     System.out.println("Yes");
            // }
        }
        for(i=left;i<=right;i++)
        {
            a=interchange(a, left, i);
            PossiblePermutation(a, left+1, right);
            a=interchange(a, left, i);
        }


    }
    
    static int[] interchange(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return a;
    }
    
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            boolean isdivisible=true;
            int n=sc.nextInt();
            int a[]=new int[n];
            int i;
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            PossiblePermutation(a, 0, n-1);
            t--;
        }

    }    
}