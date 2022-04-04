//https://www.hackerrank.com/challenges/java-regex/problem

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        final String regexPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}";
        final Pattern compiledPattern = Pattern.compile(regexPattern);
        
        while (sc.hasNextLine()) {
            Matcher matcher = compiledPattern.matcher(sc.nextLine());
            System.out.println(matcher.matches());
        }
    }
}
