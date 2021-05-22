import java.io.*;
import java.util.*;
class factorial{


    int factorial(int n)
    {
        if(n<=1)
            return 1;
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String ar[])
    {
        factorial obj=new factorial();
        int fact=obj.factorial(6);
        System.out.println(fact);
    }
}