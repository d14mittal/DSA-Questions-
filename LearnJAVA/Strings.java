public class Strings {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hell";
       
        System.out.println(s1==s);

        StringBuffer sb = new StringBuffer("String buffer ");
        sb.append("are mutable");
        sb.reverse();
        System.out.println(sb);
    }
}
