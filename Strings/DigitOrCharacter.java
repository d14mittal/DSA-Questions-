import java.util.Scanner;

public class DigitOrCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        String res="";
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(n==0){
                if(Character.isDigit(s.charAt(i))){
                    sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            else if(n==1){
                if(Character.isAlphabetic(s.charAt(i))){
                    res+=s.charAt(i);
                }
            }
        }
        if(n==0 && sum==0){
            System.out.print("ZERO");
        }
        if(n==0 && sum!=0){
            System.out.println(sum);
        }
        if(n==1 && res==""){
            System.out.print("ZERO");
        }
        if(n==1 && res!=""){
            System.out.println(res);
        }
        
    }
    
}
