/*Q)Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit from each array.
 

Example 1:

Input: nums1 = [4,1,3], nums2 = [5,7]
Output: 15
Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. It can be proven that 15 is the smallest number we can have.
Example 2:

Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
Output: 3
Explanation: The number 3 contains the digit 3 which exists in both arrays.


CODE:
*/

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
  
        int min1;
        int min2;
        int min;
      
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0;int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                min= nums1[i];
                return min;
            }
            
            if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

      
      
        min1=nums1[0];
        min2=nums2[0];
        
        min=Math.min(((min1*10)+min2),((min2*10)+min1));
  
        return min;
         
    }
}
