import java.util.*;
public class permutations {
    static Set<String> set=new HashSet<>();
    public static void main(String ar[])
    {
        permutation("abcc", 0, 3);
    }

    static void permutation(String s,int l,int r)
        {
            if(l==r)
            {
                if(set.contains(s)) return;
                set.add(s);
                System.out.println(s);
                return;
            }
            for(int i=l;i<=r;i++)
            {
                s=exchange(s,l,i);
                permutation(s,l+1,r);
                s=exchange(s,l,i);
            }
        }
        static String exchange(String s,int p,int q)
        {
            char a[]=s.toCharArray();
            char temp=a[p];
            a[p]=a[q];
            a[q]=temp;
            return String.valueOf(a);
        } 
    
}