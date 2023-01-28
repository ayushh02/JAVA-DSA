/*Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.



CODE:*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
          
            
            for(int i:nums1){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }
                else{
                    map.put(i,1);
                }
            }
            
            for(int i:nums2){
                if(map.containsKey(i)&&map.get(i)>0){
                map.put(i, map.get(i) - 1);
                     ans.add(i);
                       
                }
            }
        
        
        int [] arr = new int[ans.size()];

        for(int i=0;i<arr.length;i++){
            arr[i]= ans.get(i);
        }
     
        return arr;
        
    }
}
