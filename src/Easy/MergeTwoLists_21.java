package Easy;

public class MergeTwoLists_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode result = mergeTwoLists(l1, l2);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null)
			return null;

		ListNode result;
		ListNode temp = new ListNode(0);
		result = temp;

		while (l1 != null || l2 != null) {

			if (l1 == null) { // copy rest of l2
				while (l2 != null) {
					temp.val = l2.val;
					l2 = l2.next;
					if (l2 != null) {
						temp.next = new ListNode(0);
						temp = temp.next;
					}
				}

				return result;
			}

			if (l2 == null) { // copy rest of l2
				while (l1 != null) {
					temp.val = l1.val;
					l1 = l1.next;

					if (l1 != null) {
						temp.next = new ListNode(0);
						temp = temp.next;
					}
				}
				return result;
			}

			// both are not null

			if (l1.val <= l2.val) {
				temp.val = l1.val;
				l1 = l1.next;

				
			} else {
				temp.val = l2.val;
				l2 = l2.next;

				
			}
			
			if (l1 != null || l2!=null) {
				temp.next = new ListNode(0);
				temp = temp.next;
			}

		}

		return result;
	}
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
