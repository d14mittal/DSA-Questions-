import java.util.*;
public class palindrome 
{
    // RECURSION
    public static boolean ischeck(String str,int start,int end)
    {
       
        if(start==end)
            return true;
        if(str.charAt(start)==str.charAt(end))
            return ischeck(str,start+1,end-1);
        else
            return false;
        
    }
    public static void main(String ar[])
    {
       
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println(ischeck(string,0,string.length()-1));

    }

   
}