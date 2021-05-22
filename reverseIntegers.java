import java.util.*;
public class reverseIntegers {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=123;
        int reverse=0;
        while(n!=0)
        {
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.println(reverse);

    }
    
}