
import java.util.ArrayList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class PalindromeLL{
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();

        
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        //two-pointer technique to check for palindrome
        int left = 0;
        int right = values.size() - 1;
        while (left < right) {
            if (!values.get(left).equals(values.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}