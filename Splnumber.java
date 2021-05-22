/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class Splnumber {
    static int func(int k) 
        {
            boolean isspecial=false;
            while(isspecial==false)
            {
            String s=Integer.toString(k);
            int len =s.length();
            for(int i=0;i<len;i++)
            {
                
                if(s.charAt(i)=='2' || s.charAt(i)=='5')
                {
                    isspecial=true;
                    continue;
                }
                else
                {
                    isspecial=false;
                    k++;
                    break;
                }

            }
            
            }
        return k;
        }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int l,r,t;
        t=sc.nextInt();
        l=sc.nextInt();
        r=sc.nextInt();
        int sum=0;
        for(int i=l;i<=r;i++)
        {
            sum=sum+func(i);
        }
        System.out.println(sum);

        
        
    }
}
