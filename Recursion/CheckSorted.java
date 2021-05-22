public class CheckSorted {

    static boolean sorted(int a[], int n) {
        // boolean sorted = false;

        if(n==1 || n==0){
            return true;
        }

        boolean restarray = sorted(a, n-1);

        return (a[n-1]>a[n-2] && restarray);
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(sorted(a, 6)); 
    }
}
