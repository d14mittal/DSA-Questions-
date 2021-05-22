import java.util.*;
public class sockMerchant{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j;
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int sum=0;
    HashSet<Integer> visited=new HashSet<Integer>();
    for(i=0;i<n-1;i++)
    {
        int count=1;
        int pair=0;
        if(visited.contains(a[i]))
        {
            continue;
        }
        for(j=i+1;j<n;j++)
        {
            
            if(a[i]==a[j])
            {
                count++;
            }
            
        }
        pair=count/2;
        sum+=pair;
        visited.add(a[i]);
    }
    System.out.println(sum);
    }
}