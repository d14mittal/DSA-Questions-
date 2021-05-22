import java.util.*;
class reverse{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        StringBuilder str2=new StringBuilder();
        str2.append(str1);
        str2.reverse();
        System.out.println(str2);
      
    }
}