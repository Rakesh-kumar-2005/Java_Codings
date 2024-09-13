package Linked_List;
public class Remove_Duplicates {
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private static Node removeDuplicates(Node head){
        if(head == null || head.next == null) return head;

        Node temp = head;
        while (temp != null && temp.next != null){
            if(temp.val != temp.next.val) temp = temp.next;
            if(temp.next == null) return head;
            if (temp.val == temp.next.val)temp.next = temp.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(6);
        Node d = new Node(6);
        Node e = new Node(10);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node ans = removeDuplicates(a);
        while (ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
