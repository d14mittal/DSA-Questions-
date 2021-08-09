/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Lapindrome {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    if (br.ready()) {
                        st = new StringTokenizer(br.readLine());
                    } else {
                        st = new StringTokenizer("0");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        // your code goes here

        // FastReader sc=new FastReader();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t != 0) {
            String s = sc.next();
            int n = s.length();
            String half1 = s.substring(0, n / 2);
            String half2 = "";
            if (n % 2 == 0) {
                half2 = s.substring(n / 2);
            } else if (n % 2 != 0) {
                half2 = s.substring(n / 2 + 1);
            }
            char a[] = half1.toCharArray();
            char b[] = half2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(b[i]+" ");
            }
            // boolean isLapin=true;
            // for(int i=0;i<a.length;i++){
            // if(a[i]!=b[i]){
            // isLapin=false;
            // break;
            // }
            // }
            // if(isLapin){
            // System.out.println("Yes");
            // }
            // else{
            // System.out.println("No");
            // }

            t--;
        }
    }
}
