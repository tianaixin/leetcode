package cn.tianaixin.test;

public class RecursiveLinkedList {
    static class Node {
        Node(int value) {
            this.value = value;
        }

        private int value;
        public Node nextNode = null;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        Node node1 = new Node(6);
        Node node2 = new Node(1);
        Node node3 = new Node(10);

        head.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;

        Node res = recursiveLinkedList(node1);
        while (res != null) {
            System.out.println(res.value);
            res = res.nextNode;
        }
    }

    public static Node recursiveLinkedList(Node head) {
        if (head == null) {
            return head;
        }

        Node leftNode = head;
        Node curNode = head.nextNode;

        if (curNode == null) {
            return head;
        }

        Node rightNode = curNode.nextNode;

        head.nextNode = null;
        Node resNode = null;
        while (curNode != null) {
            curNode.nextNode = leftNode;
            resNode = curNode;

            leftNode = curNode;
            curNode = rightNode;
            if (curNode != null) {
                rightNode = curNode.nextNode;
            }
        }

        return resNode;
    }
}
