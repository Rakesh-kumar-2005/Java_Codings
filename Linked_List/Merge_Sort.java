package Linked_List;
public class Merge_Sort {
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private static Node mergeSort(Node head1, Node head2){
        Node tempA = head1;
        Node tempB = head2;
        Node ans = new Node(100);
        Node helper = ans;

        while (tempA != null && tempB != null){
            if(tempA.val > tempB.val){
                helper.next = tempB;
                tempB = tempB.next;
                helper = helper.next;
            } else {
                helper.next = tempA;
                tempA = tempA.next;
                helper = helper.next;
            }
        }
        if (tempA != null) helper.next = tempA;
        else helper.next = tempB;

        return ans.next;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(11);
        Node g = new Node(2);
        Node h = new Node(4);
        Node i = new Node(6);
        Node j = new Node(8);
        Node k = new Node(10);
        Node l = new Node(12);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = l;

        Node ans = mergeSort(a,g);
        while (ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
