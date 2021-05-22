import java.util.*;
public class NoOfOccurences {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int i,counter=0;
        for(i=1;i<=n1;i++)
        {
            int j=i,rem;
            while(j!=0)
            {
                rem=j%10;
                if(rem==n2)
                {
                    counter++;
                    if( )
                }
                j=j/10;
            }
        }
        System.out.print(counter);

    }
    
}