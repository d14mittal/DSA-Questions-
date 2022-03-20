import java.util.Scanner;


public class FirstOne{
    static int firstone(int a[]){
        int index=-1;
        int low=0,high=a.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==1){
                index=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(firstone(a));
    }
}