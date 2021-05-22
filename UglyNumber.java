class UglyNumber{
    
    static int maxdivide(int a,int b)
    {
        while(a%b==0)
        {
            a=a/b;
        }
        return a;
    }

    static int isUgly(int n)
    {
        n=maxdivide(n,2);
        n=maxdivide(n,3);
        n=maxdivide(n,5);
        if(n==1)
        {
            return 1;
        }
        else
            return 0;
    }

    static int getNthUglyNo(int n)
    {
        int i=1;
        int count=1;

        while(n>count)
        {
            i++;
            if(isUgly(i)==1)
            {
                count++;
            }
        }
        return i;
    }


}