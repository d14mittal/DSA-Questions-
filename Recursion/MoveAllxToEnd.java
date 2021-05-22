public class MoveAllxToEnd {
    static String movex(String s,int n){
        if(n==0){
            return "";
        }
        
        String newstring= movex(s.substring(1),n-1);
        if(s.charAt(0)=='x'){
            return newstring+'x';
        }
        else{
            return s.charAt(0)+newstring;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(movex("abxxbdx", 7));
    }
    
}
