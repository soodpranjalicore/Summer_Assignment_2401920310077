public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = pre;
            pre = slow;
            slow = nextNode;
        }
        ListNode left = head;
        ListNode right = pre;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }
}