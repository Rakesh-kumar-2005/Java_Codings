package Linked_List;
public class Swapping_Nodes_in_Pair {
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private static Node swapInPairs(Node head){
        if(head == null || head.next == null) return head;

        Node temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        head.next = swapInPairs(head.next);
        head = temp;

        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(11);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node ans = swapInPairs(a);
        while (ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
