import java.util.*;
public class bot{
    public static void main(String ar[])
    {
        int noofpage1,noofline1,noofpage2,noofline2,readspeed,writespeed,time;
        Scanner sc=new Scanner(System.in);
        noofpage1=sc.nextInt();
        noofline1=sc.nextInt();
        noofpage2=sc.nextInt();
        noofline2=sc.nextInt();
        readspeed=sc.nextInt();
        writespeed=sc.nextInt();
        time=sc.nextInt();
        int book1=noofpage1*noofline1;
        int book2=noofpage2*noofline2;
        if(time<book1/readspeed)
        {
            int pagesread=time*readspeed/noofline1;
            int linesread=(time*readspeed) % pagesread;

            System.out.println("READ"+" "+pagesread+" "+linesread);
        }
        else{
            int t2=time-book1/readspeed;
            int pageswrite=t2*writespeed/noofline2;
            int lineswrite=(t2*writespeed) % pageswrite;

            System.out.println("WRITE"+" "+pageswrite+" "+lineswrite);
        }
    }
}