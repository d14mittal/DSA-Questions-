import java.util.*;
public class kadaneBrutforce {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        n=a.length;
        // int sumarr[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        // int max_sum=a[0];
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                list.add(sum);         
            }
        }
        int maxsum=list.get(0);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>maxsum)
                maxsum=list.get(i);
        }
        System.out.println(maxsum);

    }
    
}