/*Q)Fibonacci Number

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.


CODE:*/

class Solution {
    public int fib(int n) {
   /* RECCURSION
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    */

      /*DP*/
    if(n==0||n==1){
        return n;
    }

    int pre=0;
    int cur=1;
  
     for(int i=2;i<=n;i++){
         int temp = cur+pre;
         pre = cur;
            cur = temp;
        }
        return cur;
    }
}
