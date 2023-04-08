import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static List<Integer> solution(int a[], int b[]) {
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                list.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                while (a[i] < b[j]) {
                    i++;
                }
            } else {
                while (a[i] > b[j]) {
                    j++;
                }
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        int a[] = { 2, 2, 4, 5, 6, 7, 7, 9 };
        int b[] = { 1, 2, 2, 5, 5, 6, 6, 7, 9, 9 };
        System.out.print(solution(a, b));
    }
    
}
