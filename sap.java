import java.util.*;
public class sap{
    public static void main(String ar[]){
        String str="i,am,in,interview";
        String s[]=str.split(",");
        int n1=str.length();
        int n2=s.length;
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<n2;i++){
            stack.push(s[i]);
        }
        String result="";
        for(int i=0;i<n2;i++){
            String temp=stack.pop();
            result=result+temp+",";    
        }
        System.out.println(result);
    }
}