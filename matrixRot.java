import java.util.*;
public class matrixRot {
    
    public static void main(String ar[])
    {
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> b=new ArrayList<ArrayList<Integer>>();
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                int ai=sc.nextInt();
                a.add(ai);
            }
        }
        for(i=0;i<a.size();i++)
        {
            for(j=0;j<a.get(i).size();j++)
                b.get(j).set(a.get(i).size()-1-i,a.get(i).get(j));
        }
        for(i=0;i<b.size();i++)
        {
            for(j=0;j<b.get(i).size();j++)
            {
                System.out.print(b.get(i).get(j));
            }
        }


        
        
    }    
        
        
        
    
}