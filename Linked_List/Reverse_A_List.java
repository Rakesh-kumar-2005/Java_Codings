package Linked_List;
public class Reverse_A_List {
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    private static Node reverse(Node head){
        if (head == null || head.next == null) return head;

        Node prev = null;
        Node curr = head;
        Node after = curr.next;
        curr.next = null;

        while (after != null){
            prev = curr;
            curr = after;
            after = after.next;
            curr.next = prev;
        }
        return curr;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(12);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node ans = reverse(a);
        while (ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
