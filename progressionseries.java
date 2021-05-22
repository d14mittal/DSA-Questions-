import java.util.*;
import java.lang.Math;
public class progressionseries{
    public static void main(String ar[])
    {
        int i,j,N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        if(N%2==0)
        {
            double E=Math.pow(3,N/2-1);
            System.out.println(E);

        }
        else{
            double O=Math.pow(2,N/2);
            System.out.println(O);
        }
    }
}