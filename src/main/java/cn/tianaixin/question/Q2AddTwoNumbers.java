package cn.tianaixin.question;

public class Q2AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(8);
        ListNode l2 = new ListNode(2);

        Q2AddTwoNumbers twoNumbersQuestion = new Q2AddTwoNumbers();
        ListNode resNode = twoNumbersQuestion.addTwoNumbers(l1, l2);
        System.out.print(resNode.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode resNode = new ListNode(0);
        ListNode thisNode = resNode;
        while (l1 != null || l2 != null) {
            Integer v1 = (l1 == null) ? 0 : l1.val;
            Integer v2 = (l2 == null) ? 0 : l2.val;

            Integer sum = v1 + v2 + carry;
            thisNode.val = sum % 10;

            carry = sum / 10;
            if (l1.next != null || carry == 1) {
                thisNode.next = new ListNode(0);
                thisNode = thisNode.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        if (carry == 1) {
            thisNode.next = new ListNode(1);
        }

        return resNode;
    }

    private Integer getNumFromNode(ListNode listNode) {
        int num = 0;
        int multiple = 1;

        while (listNode != null) {
            num += listNode.val * multiple;
            listNode = listNode.next;
            multiple *= 10;
        }

        return num;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
