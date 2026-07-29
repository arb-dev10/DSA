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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)return head;
        ListNode less=new ListNode(-1);
        ListNode more=new ListNode(-1);
        ListNode temp1=less;
        ListNode temp2=more;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                temp1.next=temp;
                temp1=temp1.next;
            }
            else{
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp2.next=null;
        temp1.next=more.next;
        return less.next;
    }
}