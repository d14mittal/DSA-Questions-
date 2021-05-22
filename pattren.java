import java.util.*;
public class pattren {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        int print=1;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=2*i;j++)
            {
                System.out.print(print);
            }
            System.out.println();
        }

    }
}
