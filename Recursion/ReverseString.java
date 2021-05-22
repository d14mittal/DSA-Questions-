public class ReverseString {
    static String reverse(String s) {
        if (s == null || s.length() == 1) {
            return s;
        }
        String rest = s.substring(1);
        String reverse = reverse(rest) + s.charAt(0);
        return reverse;

    }
    public static void main(String[] args) {
        System.out.println(reverse("d"));
    }
    
}
