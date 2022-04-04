//https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            
            boolean output = true;
            Stack<Character> delimeterStack = new Stack<>();
            
            
            for (int i = 0; i < input.length(); i++) {           
                try {
                    switch(input.charAt(i)) {
                        case ')':
                            if (delimeterStack.pop() != '(') { 
                                output = false;
                            }
                            break;
                        case '}':
                            if (delimeterStack.pop() != '{') { 
                                output = false;
                            }
                            break;
                        case ']':
                            if (delimeterStack.pop() != '[') { 
                                output = false;
                            }
                            break;
                        default: 
                            delimeterStack.push(input.charAt(i));
                            break;
                    }
                } catch (Exception EmptyStackException) {
                    output = false;
                }
            }
            System.out.println(delimeterStack.empty() && output);
		}
	}
}


