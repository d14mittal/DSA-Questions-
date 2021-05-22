package ApnaCollege;
import java.util.*;
public class video85 {
    public static void main(String ags[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int ind[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ind[i]=-1;
        }
        int minind=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(ind[a[i]]==-1)
                ind[a[i]]=i;
            else
                minind=Math.min(minind, ind[a[i]]);
        }
        if(minind==Integer.MAX_VALUE)
            System.out.println("-1");
        else
            System.out.println(minind+1);
    }
    
}
