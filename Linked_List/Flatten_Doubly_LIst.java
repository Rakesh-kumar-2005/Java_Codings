package Linked_List;
public class Flatten_Doubly_LIst {
    private static class Node{
        int val;
        Node next;
        Node prev;
        Node child;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
            this.child = null;
        }
    }

    private static Node flatten(Node head) {

        Node temp = head;
        while(temp != null) {
            Node t = temp.next;
            if(temp.child != null) {
                Node helper = flatten(temp.child);
                temp.next = helper;
                helper.prev = temp;

                while (helper.next != null) {
                    helper = helper.next;
                }
                helper.next = t;
                if (t != null) t.prev = helper;
            }
            temp.child = null; //have to erase the child pointer
            temp = t;
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(11);
        Node g = new Node(13);
        Node h = new Node(14);
        Node i = new Node(15);
        Node j = new Node(16);
        Node k = new Node(17);
        Node l = new Node(18);

        a.next = b;     c.child = g;    h.child = j;
        b.prev = a;
        b.next = c;     g.next = h;     j.next = k;
        c.prev = b;     h.prev = g;     k.prev = j;
        c.next = d;     h.next = i;     k.next = l;
        d.prev = c;     i.prev = h;     l.prev = k;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;

        Node ans = flatten(a);
        while (ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
