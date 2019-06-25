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
        Integer num1 = getNumFromNode(l1);
        Integer num2 = getNumFromNode(l2);

        Integer res = num1 + num2;
        return new ListNode(res);
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
