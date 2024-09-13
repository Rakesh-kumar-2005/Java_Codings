package Linked_List;
public class Deep_copy_with_Random_pointers {
    private static class Node{
        int val;
        Node next;
        Node random;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    private static Node deepCopy(Node head){

        Node temp1 = head;
        Node head2 = new Node(0);
        Node temp2 = head2;

        while (temp1 != null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp1 = head;
        temp2 = head2;

        Node temp = new Node(-1);
        while (temp1 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        temp1 = head;
        temp2 = head2;
        while (temp1 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if (temp1 != null) temp2 = temp1.next;
        }

        temp1 = head;
        temp2 = head2;

        while (temp1 != null){
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if (temp1 == null) break;
            temp2.next = temp1.next;
            if (temp2.next == null) break;
            temp2 = temp2.next;
        }
        return head2;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(11);

        a.next = b; a.random = f;
        b.next = c; b.random = d;
        c.next = d; c.random = null;
        d.next = e; d.random = b;
        e.next = f; f.random = a;

        Node ans = deepCopy(a);
        while (ans != null){
            System.out.println(ans.val + " " + ans.random.val);
            ans = ans.next;
        }
    }
}
