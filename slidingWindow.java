/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class slidingWindow{
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        int x=sc.nextInt();
        int i,j;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            int sum=0;
            for(j=i;j<n;j++)
            {
                sum=sum+a[j];
                if(sum>x)
                    {
                        list.add(j-i+1);
                        break;
                    }
            }
        }
        int s=list.get(0);
        for(i=0;i<list.size();i++)
        {
            if(list.get(i)<s)
                s=list.get(i);
        }
        System.out.println(s);
        }
        
	}
}