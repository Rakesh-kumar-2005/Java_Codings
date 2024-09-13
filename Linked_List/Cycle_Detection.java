package Linked_List;

public class Cycle_Detection {
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private static Node cyclePosition(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)  break;
        }

        Node temp = head;
        while (temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow;

    }
    private static boolean cyclePresent(Node head){
        if (head == null || head.next == null) return false;

        Node fast = head;
        Node slow = head;

        while (fast != null){
            slow = slow.next;
            if (fast.next == null) return false;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(12);
        Node g = new Node(42);
        Node h = new Node(72);
        Node i = new Node(2654);
        Node j = new Node(43);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = c;

        System.out.println("Result of presence of a cycle : " + cyclePresent(a));
        System.out.println("Cycle Starts from the node with the value :  "+ cyclePosition(a).val);
    }

}
