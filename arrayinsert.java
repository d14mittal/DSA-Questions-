import java.util.*;
public class arrayinsert {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int a[]=new int[n];
        int c=0;
        for(i=0;i<4;i++)
        {
            a[i]=sc.nextInt();
            c++;
        }
        int idx=sc.nextInt();
        for(i=c-1;i>=idx;i--)
        {
            a[i+1]=a[i];
        }
        a[idx]=6;
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");

    }
}