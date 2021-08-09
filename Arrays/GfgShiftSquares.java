import java.util.Scanner;

public class GfgShiftSquares{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=a[i];
        }
        int count=0;
        int area=n*m;
        while(sum>0){
            sum=sum-area;
            count++;

        }
        System.out.println(count);
    }
}