public class recursion {
    
    static int power(int n,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        else{
            return n*power(n,pow-1);
        }
    }
    static int sumofN(int n){
        if(n==1)
            return 1;
        else
            return n+f(n-1);
        
    } 
    static int matrixNoOfWaysToreachLastCell(int m,int n)
    {
        if(m==1 || n==1)
            return 1; 
        else
            return matrixNoOfWaysToreachLastCell(m,n-1)+matrixNoOfWaysToreachLastCell(m-1,n);
    }
    
    public static void main(String ar[])
    {
        System.out.println(matrixNoOfWaysToreachLastCell(4,4));
    }
    
}