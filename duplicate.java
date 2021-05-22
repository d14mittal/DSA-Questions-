import java.util.*;
public class duplicate {
    static List<Integer> findDuplicate(int arr[],int n)
    {
        int acount[]=new int[n];
        List<Integer> list=new ArrayList<Integer>();
        int i;
        for(i=0;i<n;i++)
        {
            acount[arr[i]]++;
            if(acount[arr[i]]>1)
            {
                list.add(arr[i]);
                return list
            }
        }
        if(list.size()==0)
        {
            list.add(-1);
        }
        return list;

        
    
    }
    public static void main(String a[])
    {
        int arr[]={2,3,1,2,3,2};
        
        System.out.print(findDuplicate(arr,6));
    }
    
}