//https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int incrementHolder = a;
            int exponentHolder;
            for (int j=0; j<n; j++) { 
                exponentHolder = (int) Math.pow(2,j);
                incrementHolder = incrementHolder+(exponentHolder*b);
                System.out.print(incrementHolder + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
