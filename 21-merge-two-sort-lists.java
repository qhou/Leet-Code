/*
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

input: 
[1,3,5,7,9]
[2,4,6,8]

output:
[1,2,3,4,5,6,7,8,9]
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2; 
        if (l2 == null) return l1;
        
        ListNode l3;
        //if l1's first node is smaller, add to new array
        //else add l2 to new array
        
            if (l1.val < l2.val){
                l3 = l1;
                l3.next = mergeTwoLists(l1.next, l2);
            } else{
                l3 = l2;
                l3.next = mergeTwoLists(l1, l2.next);
            }
        
        return l3;
    }
}