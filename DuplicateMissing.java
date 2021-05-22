/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class DuplicatMissing{
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int i,j;
		while(t!=0)
		{
            Scanner sc=new Scanner(System.in);

		    int N=sc.nextInt();
		    int a[]=new int[N];
		    for(i=0;i<N;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(i=0;i<N;i++)
		    {
		        if(a[i]!=i+1)
		        {
		            System.out.print(a[i]+" ");
		            System.out.print(i+1);
		            
		        }
		    }
		}
	}
}