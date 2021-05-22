import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class leftRot {

    // Complete the rotLeft function below.
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n];
        d=d%n;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=d;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(i=0;i<d;i++)
        {
            System.out.print(a[i]+" ");
        }
    
    
    }
}
   