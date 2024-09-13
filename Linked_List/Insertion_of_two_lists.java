package Linked_List;
public class Insertion_of_two_lists {
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private static Node getIntersection(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int length1 = 0 , length2 = 0;

        while (temp1 != null){
            temp1 = temp1.next;
            length1++;
        }
        while (temp2 != null){
            temp2 = temp2.next;
            length2++;
        }

        temp1 = head1;
        temp2 = head2;

        if(length1 > length2){
            int steps = length1 - length2;
            for (int i = 0; i < steps; i++){
                temp1 = temp1.next;
            }
        }else {
            int steps = length2 - length1;
            for (int i = 0; i < steps; i++){
                temp2 = temp2.next;
            }
        }

        while (temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
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
        Node i = new Node(2);
        Node j = new Node(2);
        Node k = new Node(2);
        Node l = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        f.next = g;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = l;
        l.next = c;

        Node ans = getIntersection(a,h);
        System.out.println("The value of the node from where the intersection starts : " + ans.val);
    }
}