package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 147 Insertion Sort List
// Link: https://leetcode.com/problems/insertion-sort-list/


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class InsertionSortList_147 {

    // TC: O(n), faster than 77%
    public ListNode insertionSortList(ListNode head) {
        ListNode sortCurr = head;
        ListNode next = head.next;
        ListNode current = next;
        ListNode previous = head;


        while (next != null) {
            next = next.next;

            if (head.val > current.val) {
                current.next = head;
                head = current;
            }  else if (previous.val > current.val) {
                sortCurr = head;

                while (sortCurr.next != null && sortCurr.next.val <= current.val) {
                    sortCurr = sortCurr.next;
                }
                current.next = sortCurr.next;
                sortCurr.next = current;

            }

            if (previous.val <= current.val) {
                previous = current;
            }
            else previous.next = next;
            current = next;


        }
        return head;
    }
}
