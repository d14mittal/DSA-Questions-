import java.util.*;
public class binarysearch {
    
    static int findElement(int a[],int left,int right,int x)
    {
        int mid=left+(right-left)/2;
        if(right>left)
        {
            if(a[mid]==x)
        {
            return mid;
        }
        else if(x<a[mid])
        {
            return findElement(a, left, mid-1, x);
        }
        return findElement(a, mid+1, right, x);
        }
        
        
        return -1;
        
    }
    
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int found=findElement(a, 0, n-1,x);
        if(found==-1)
        {
            System.out.println("not found");
        }
        
        else
            System.out.println("x present at pos: "+found);

    }
}