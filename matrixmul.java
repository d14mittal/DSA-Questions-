import java.util.*;
public class matrixmul {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,p,k;
        m=sc.nextInt();
        n=sc.nextInt();
        p=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[n][p];
        int c[][]=new int[m][p];
       
     
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            for(j=0;j<p;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(i=0;i<m;i++)
        {
            for(j=0;j<p;j++)
            {
                for(k=0;k<n;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        

        

    }
    
}