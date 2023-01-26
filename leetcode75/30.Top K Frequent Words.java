/*Q)Top K Frequent Words

Given an array of strings words and an integer k, return the k most frequent strings.
Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

Example 1:
Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.

Example 2:
Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.



Approach
1.Add all the elements with their frequency to treemap(treemap because it sorts the elements alphabetically according to key by default).
2.add all the values to priority queue(max heap).
3.retrieve k elements from priority queue and retriece their key value from treemap and add that to a list and return the list.

CODE:*/

import java.util.Map.Entry;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder()); 
        TreeMap<String,Integer> map=new  TreeMap<String,Integer>(); 
        ArrayList<String>ans=new ArrayList<>();

        for(String s : words)
            map.put(s, map.getOrDefault(s, 0) + 1);

            

        for(Entry<String, Integer> entry:map.entrySet()) {
         q.add(entry.getValue()); 
        }  

        while(k>0){
            int x=q.poll();
            for(Entry<String, Integer> entry:map.entrySet()) {
                if(entry.getValue() == x) {
                    ans.add(entry.getKey());
                    map.remove(entry.getKey());
                    break;
                }
                    
            } 
        k--; 
        }
        
   
   
        return ans;

    }
}
