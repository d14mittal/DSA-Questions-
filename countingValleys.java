import java.util.*;

public class countingValleys {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int valley=0,sealevel=0;
        String s=sc.nextLine();
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='D')
            {
                if(sealevel==0)
                {
                    valley++;
                }
                sealevel--;
            }
            else if(s.charAt(i)=='U')
            {
                sealevel++;
            }
        }
        System.out.println(valley);
    }
}