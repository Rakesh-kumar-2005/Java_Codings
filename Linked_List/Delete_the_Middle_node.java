package Linked_List;
public class Delete_the_Middle_node {
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private static Node delete_leftMiddle(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node fast = head;
        Node slow = head;

        while (fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    private static Node delete_rightMiddle(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node fast = head;
        Node slow = head;

        while (fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(12);
        Node g = new Node(42);
        Node i = new Node(69);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = i;

        Node ans = delete_leftMiddle(a);
        while (ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }

        ans = delete_rightMiddle(a);
        while (ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

}
