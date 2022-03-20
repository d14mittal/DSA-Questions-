package BinarySearch;
import java.util.*;
public class AggressiveCows {

    static int largestmin(int a[],int cows){
        Arrays.sort(a);

        int low=1;
        int n=a.length;
        int high=a[n-1]-a[0];
        int res=-1;
        while(low<=high){
            int mid=(low+high)>>1;
            if(canPlaceCows(a,n,cows,mid)){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        static boolean canPlaceCows(int mid){
            int count=1;
            int coord=a[0];
            for(int i=1;i<n;i++){
                if(a[i]-coord>=mid){
                    count++;
                    coord=a[i];
                }
                if(count==cows){
                    return true;
                }
            }
            return false;

        } 
        
        
    }

    public static void main(String[] args) {
        
  
}

}
