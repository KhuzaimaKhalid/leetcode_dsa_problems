import java.util.Stack;
// https://leetcode.com/problems/valid-parentheses/submissions/1846058664/
public class ValidParenthesis_Q6 {
    public boolean isValid(String s) {
       boolean result = true;
       int n = s.length();
       if(n % 2 != 0){
          return result = false;
       }
       char[] stack = new char[n];
       int top = -1;
       for(char c : s.toCharArray()){
           if(c == '(' || c == '{' || c == '['){
               stack[++top] = c;
           } else {
               if(top == -1){
                   result = false;
                   break;
               }
               char open = stack[top--];
               if(c == ')' && open != '(' || c == '}' && open != '{' || c == ']' && open != '['){
                   result = false;
                   break;
               }
           }
       }
       if(top != -1){
           result = false;
       }
       return result;
    }


    public static void main(String[] args) {
        ValidParenthesis_Q6 v = new ValidParenthesis_Q6();
        String s = "[()()]{}";
        System.out.println((v.isValid(s)+ " "));
    }
}
