import java.util.*;
public class FloodFill {
   
    static void FloodFillf(int a[][],int r,int c,int tofill, int prev)
    {
        int row=a.length;
        int col=a[0].length;
        // if(a[r][c]!=prev){
        //     return;
        // }
        if(r<0 || r>row || c<0 || c>col){
            return;
        }
        a[r][c]=tofill;
        FloodFillf(a,r-1,c,tofill,prev);
        FloodFillf(a,r+1,c,tofill,prev);
        FloodFillf(a,r,c-1,tofill,prev);
        FloodFillf(a,r,c+1,tofill,prev);
    }

    static int[][] printMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                int p=a[i][j];
                return p;
            }
        }
    }
    public static void main(String ar[])
    {        
        int i,j;
        int a[][]={ {1,2,3,4},{2,2,2,2},{2,3,2,2}};
        FloodFillf(a, 2, 2,0,2);
        System.out.print(printMatrix(a)+ " ");
                
    }
}