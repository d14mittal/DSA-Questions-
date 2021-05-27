public class PermutationsOfString {


    static void permutation(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String rest=s.substring(0, i)+s.substring(i+1);

            permutation(rest, ans+ch);
        }

    }

    public static void main(String[] args) {
        permutation("ABC", "");
    }
    
}
