//Find the max Index

import java.lang.Math;
import java.util.*;

public class FindMax{
    public static int max_index_reached(int N, int B){
        int max_index = 0;
        for(int i=0;i<N;i++){
            if(i!=B){
                max_index += Math.pow(2,N-i-1);
            }
        }
        return max_index;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first argument ");
        int N=sc.nextInt();
        System.out.println("Please enter the second argument ");
        int B=sc.nextInt();
        
        System.out.println("The Max valid index is " +max_index_reached(N,B));
        
    }
}
