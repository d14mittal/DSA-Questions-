import java.util.*;
public class fibonacci {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int f,i,n,a,b,c;
        a=0;
        b=1;
        n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");

        for(i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}