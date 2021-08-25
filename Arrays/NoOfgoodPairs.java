class NoOfgoodPairs {
    public static int numIdenticalPairs(int[] a) {
        int count=0;
        int n=a.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,a[i]);
        }
        int f[]=new int[max+1];
        for(int i=0;i<n;i++){
            f[a[i]]++;
        }
        for(int i=0;i<max+1;i++){
            count+=(f[i]*(f[i]-1))/2;
        }
        return count;        
    }
    
}