import java.util.*;
class selectionsort{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n=sc.nextInt();

        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int minIndex=i;
            boolean sorted =true;
            for(j=i;j<n;j++)
            {
                if(a[j]<a[minIndex])
                {
                    minIndex=j;
                }
            }
                int temp=a[i];
                a[i]=a[minIndex];
                a[minIndex]=temp;
                sorted=false;
            if(sorted)
            {
                break;
            }



        }
        for(int r:a)
        {
            System.out.print(r+" ");
        }



    }
}