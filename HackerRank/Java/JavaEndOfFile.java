//https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i = 1;
        do {
            System.out.print(i + " ");
            System.out.print(scan.nextLine() + "\n");
            i++;
        } while (scan.hasNext());
    }
}
