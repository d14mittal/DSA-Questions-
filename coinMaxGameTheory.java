public class coinMaxGameTheory {
    static int coinMax(int a[],int l,int r)
    {
        if(l+1==r)
            return Math.max(a[l],a[r]);
        return Math.max(a[l]+Math.min(coinMax(a,l+2,r),coinMax(a,l+1,r-1)),a[r]+Math.min(coinMax(a,l+1,r-1),coinMax(a,l,r-2)));
    }
    public static void main(String ar[])
    {
         int a[]={1,5,700,2};
         System.out.println(coinMax(a,0,a.length-1));
    }
}