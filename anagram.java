import java.util.*;
public class anagram {
    public static void main(String ar[])
    {
        String a="poiuytrewqasdfghjklzxcvbnm";
        String b="qwertyuioplkjhgfdsamnbvcxz";
        int i,j;
        boolean isanagram=true;
        // O(n^2) method
        // boolean visited[]=new boolean[b.length()];
        // for(i=0;i<a.length();i++)
        // {
        //      isanagram=false;
        //     char c=a.charAt(i);
        //     for(j=0;j<b.length();j++)
        //     {
        //         if(c==b.charAt(j)  && !visited[j])
        //         {                    
        //             visited[j]=true;
        //             isanagram=true;
        //             break;
        //         }

        //     }
        //     if(!isanagram)
        //     {
        //         break;
        //     }
        // }
        // if(isanagram)
        // {
        //     System.out.println("is anagram");
        // }
        // else{
        //     System.out.println("not an anagram");
        // }
        //O(n) more optimized
        int acount[]=new int[256];
        
        for(char c:a.toCharArray())
        {
            int index=(int)c;
            acount[index]++;
        }
        for(char c:b.toCharArray())
        {
            int index=(int)c;
            acount[index]--;
        }

        for(i=0;i<256;i++)
        {
            if(acount[i]!=0)
            {
                isanagram=false;
                break;
            }
        }
        if(isanagram)
        {
            System.out.println("is anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}