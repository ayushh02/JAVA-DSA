/*Q. Running Sum of 1d Array
   Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

   Return the running sum of nums.

  Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


Code:*/
    class Solution {
    public int[] runningSum(int[] nums) {
        int rs[]=new int[nums.length];
        int i=0;
        int cur=0;
        int j=0;
        while(i<(nums.length)){
            cur+=nums[i];
            rs[j]=cur;
            j++;
            i++;
        }
return rs;
    }
}
