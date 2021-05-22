public class FirstNLastOccurence {
    static int lastocc(int a[], int i, int k) {
        if (i == -1) {
            return -1;
        }
        if (a[i] == k) {
            return i;
        }
        return lastocc(a, i - 1, k);
    }
    
    static int firstocc(int a[], int i, int k) {
        if (i == a.length) {
            return -1;
        }
        if (a[i] == k) {
            return i;
        }
        return lastocc(a, i + 1, k);
    }
    public static void main(String[] args) {
        int a[] = { 1, 7, 3, 7, 8, 7};
        System.out.println(lastocc(a, a.length - 1, 7));
        System.out.println(firstocc(a, 0, 7));
        
    }
    
}
