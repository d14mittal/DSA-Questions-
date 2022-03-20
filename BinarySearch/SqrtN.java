import java.util.Scanner;

// package BinarySearch;

public class SqrtN {
    static int squareroot(int n) {
        int ans = -1;
        int low = 1, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(squareroot(n));
    }
}
