//https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        int tempVal;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            tempVal = temp.val;
            temp.val = temp.next.val;
            temp.next.val = tempVal;
            temp = temp.next.next;
        }
        return head;
    }
}