/*Q)Backspace String Compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".



CODE:*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
         Stack<Character> stack1= new Stack<>();
         Stack<Character> stack2= new Stack<>();
       

         for(int i=0;i<s.length();i++){
             if (s.charAt(i) != '#') {
                stack1.push(s.charAt(i));
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
         }

         for(int i=0;i<t.length();i++){
             if (t.charAt(i) != '#') {
                stack2.push(t.charAt(i));
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
         }
           
         
          while(!stack1.isEmpty()&&!stack2.isEmpty()){
              if(stack1.pop()!=stack2.pop()){
                  return false;
              }
          }
          if(stack1.isEmpty()&&stack2.isEmpty()){
              return true;
          }
          return false;
    }
}
