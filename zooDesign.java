import java.util.*;
class zooDesign{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int cost_per_square[]=new int[3];
        int i,j;
        for(i=0;i<3;i++)
        {
            cost_per_square[i]=sc.nextInt();
        }
        int max_area[]=new int[3];
        for(i=0;i<3;i++)
        {
            max_area[i]=sc.nextInt();
        }
        int min_no_of_animals[]=new int[3];
        int min_area_for_that_animal[]=new int[3];
        for(i=0;i<3;i++)
        {
            min_no_of_animals[i]=sc.nextInt();
            min_area_for_that_animal[i]=sc.nextInt();
        }
        int total_land_area=sc.nextInt();
        int max=cost_per_square[0];
        for(i=0;i<3;i++)
        {
            if(cost_per_square[i]>max)
            {
                max=cost_per_square[i];
            }
        }
        int min=cost_per_square[0];
        for(i=0;i<3;i++)
        {
            if(cost_per_square[i]<min)
            {
                min=cost_per_square[i];
            }
        }
        int area_allocated[]=new int[3];
        int area_max_allocated,area_min_allocated;
        for(i=0;i<3;i++)
        {
            if(max==cost_per_square[i])
            {
                area_allocated[i]=min_no_of_animals[i]*min_area_for_that_animal[i];
            }
        }
        for(i=0;i<3;i++)
        {
            if(min==cost_per_square[i])
            {
                area_allocated[i]=max_area[i];
            }
        }
        // int area_left=total_land_area-area_max_allocated-area_min_allocated;
        int sum_area_allocated=0;
        for(i=0;i<3;i++)
        {
            sum_area_allocated+=area_allocated[i];
        }
        

        for(i=0;i<3;i++)
        {
            if(area_allocated[i]==0)
            {
                area_allocated[i]=total_land_area-sum_area_allocated;
            }
        }
        int min_cost_required=0;
        for(i=0;i<3;i++)
        {
            min_cost_required+=cost_per_square[i]*area_allocated[i];
        }
        System.out.println(min_cost_required);


        



        

    }
}