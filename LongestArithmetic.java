import java.util.*;
public class LongestArithmetic{
    public static void main(String arp[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int caseno=1;
        while(caseno!=t+1)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int globalmax=0;
            for(int i=0;i<n-1;i++)
            {
                int localmax=1;
                int k=a[i+1]-a[i];
                for(int j=i;j<n-1;j++)
                {
                    if(a[j+1]-a[j]==k)
                    {
                        localmax++;
                    }
                    else{
                        globalmax=Math.max(globalmax,localmax);
                        break;
                    }
                }
            }
            System.out.println("Case #"+caseno+":"+globalmax);
            caseno++;
        }
    }
}