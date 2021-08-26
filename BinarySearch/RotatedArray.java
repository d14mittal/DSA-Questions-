package BinarySearch;

public class RotatedArray {
    static int rotatedArray(int a[],int target){
        int n=a.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==target){
                return mid;
            }
            else if (a[mid]>=a[l]){
                if(target>=a[l] && target<=a[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(target>=a[mid] && target<=a[h]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,8,8,9,11,-6,-4,-3,0};
        System.err.println(RotatedArray.rotatedArray(a,-6));
    }    
}
