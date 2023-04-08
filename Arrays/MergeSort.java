import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    private static void merge(int[] a, int l, int mid, int r) {

        int b[] = new int[a.length];
        int i = l, j = mid, k = 0;
        while (i <= mid && j <= r) {
            if (a[i] > a[j]) {
                b[k] = a[j];
                j++;
            } else {
                b[k] = a[i];
                i++;
            }
            k++;
        }
        
        while (i < mid) {
            b[k] = a[i];
            i++;
            k++;
        }
        
        while (j < r) {
            b[k] = a[j];
            j++;
            k++;
        }

    }

    public static void main(String ar[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        mergeSort(a, 0, a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }    
}
