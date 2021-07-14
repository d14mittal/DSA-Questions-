import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fact(num));
    }

    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int f=1;
        for(int i=2;i<n+1;i++){
            f=f*i;
        }
        return f;
    }
    
}
