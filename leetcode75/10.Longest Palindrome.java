/*Q)Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.



CODE:*/

class Solution {
    public int longestPalindrome(String s) {
        int result=0;
        int[] a=new int[128];
        for(char c:s.toCharArray()){
            a[c]++;
        }

        for(int i:a){
            result += i/2 *2;

            if(result%2==0 && i%2!=0){
                result++;
            }
        }
        return result;
    }
}
