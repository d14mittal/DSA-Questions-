import java.util.*;
public class power {
    public static void main(String ar[])
    {
        int result=1,i;
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        for(i=0;i<b;i++)
        {
            result=result*a;
        }
        System.out.println(result);
    }
}