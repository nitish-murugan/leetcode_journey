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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int[] tempLst = new int[100001];
        for(int i: nums){
            tempLst[i] = 1;
        }
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            if(tempLst[curr.val] == 1){
                if(prev == null){
                    head = head.next;
                } else{
                    prev.next = curr.next;
                }
            } else{
                prev = curr;
            }
            curr = curr.next;
        }
        return head;

    }
}