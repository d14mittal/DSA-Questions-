public class Implement{
    
    static int binaryserach(int a[], int k){
        int n=a.length;
        int l=0,h=n-1;    
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==k){
                return mid;
            }
            else if(a[mid]>k){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
      
    public static void main(String[] args) {
        int a[]={1,2,3,6,8,9,10,34};
        System.out.println(binaryserach(a, 7));
    }
}