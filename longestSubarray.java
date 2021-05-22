import java.util.*;
public class longestSubarray {
    public static int longestsubarray(List<Integer> arr) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 1;
        while (i < arr.size() - 1) {
            set.add(arr.get(i));
            while (j < arr.size() && Math.abs(arr.get(i) - arr.get(j)) < 2) {
                if (!set.contains(arr.get(j))) {
                    if (set.size() == 2) {
                        break;
                    } else {
                        set.add(arr.get(j));
                    }
                }
                ++j;
            }
            max = Math.max(max, j - i);
            j = ++i + 1;
            set.clear();
        }
        return max;
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int j=sc.nextInt();
            a.add(j);
        }
        System.out.println(longestsubarray(a));

    }
}