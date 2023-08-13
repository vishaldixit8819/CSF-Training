import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Merge_two_sorted_lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            } else {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            }
        }
        if (list1 == null) {
            temp.next = list2;
        } else {
            temp.next = list1;
        }
        return head.next;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the first sorted linked list:");
        String[] input1 = sc.nextLine().split(" ");
        ListNode list1 = linkedList_create(input1);

        System.out.println("Enter the elements of the second sorted linked list:");
        String[] input2 = sc.nextLine().split(" ");
        ListNode list2 = linkedList_create(input2);

        ListNode mergedList = mergeTwoLists(list1, list2);
        Print_linkedList(mergedList);
    }

    public static ListNode linkedList_create(String[] input) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (String valStr : input) {
            int val = Integer.parseInt(valStr);
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void Print_linkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
