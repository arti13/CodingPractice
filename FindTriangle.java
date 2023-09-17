// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class FindTriangle{
    public static void checkTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        int a = (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
        if(a == 0)
            System.out.println("No ");
        else
            System.out.println("Yes ");
        
    }
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the first co-ordinates  - x1, y1 ");
       int x1 = sc.nextInt();
       int y1 = sc.nextInt();
       System.out.println("Please enter the second co-rodinates x2, y2  ");
       int x2 = sc.nextInt();
       int y2 = sc.nextInt();
       System.out.println("Enter the third co-ordinate x3, y3 ");
       int x3 = sc. nextInt();
       int y3 = sc.nextInt();
       checkTriangle(x1,y1, x2,y2,x3,y3);
    }
}
