public class AlternatDelete {
    public static void main(String ar[])
    {
        System.out.print(Rearrange(12345));
    }
    static public int Rearrange(int n)
    {
        String s1=Integer.toString(n);
        String s2=new String();
        for(int i=0;i<s1.length();i=i+2)
        {
            s2=s2+s1.charAt(i);
        }
        return Integer.parseInt(s2);
    }
}
