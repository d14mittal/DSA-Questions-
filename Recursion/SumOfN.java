public class SumOfN {
    
    static int f(int n){
        if(n==1)
            return 1;
        else
            return n+f(n-1);
        
    } 
    public static void main(String ar[])
    {
        System.out.println(f(10));
    }
    
}