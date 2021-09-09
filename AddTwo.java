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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        long one = toNumber(l1);
        long two = toNumber(l2);
        return toList(one + two);
    }

    protected ListNode toList(long number) {
        if (number < 10) {
            
            return new ListNode((int) number);
            
        }
        return new ListNode((int) (number % 10), toList(number / 10));
    }

    protected long toNumber(ListNode l) {
        
        long result = l.val;
        
        long pos = 1;
        
        while (l.next != null) {
            l = l.next;
            result += l.val * (Math.pow(10, pos++));
        }
        
        return result;
        
    }
}