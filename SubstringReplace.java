// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class RemoveSubstr{
    public static void remove(String str){
        String target = "AWS";
        String processed = str.replaceAll(target, "");
        System.out.println(processed);
        
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the string ");
       String s = sc.nextLine();
       remove(s);       
    }
}
