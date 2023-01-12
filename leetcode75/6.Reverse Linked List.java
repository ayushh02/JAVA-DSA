/* Q)Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]


CODE: */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

       ListNode cur=head;
       ListNode prev=null;

       while(cur!=null){
           ListNode temp=cur.next;

           cur.next=prev;
           prev=cur;
           cur=temp;
       }
       return prev;

        
    }
}


