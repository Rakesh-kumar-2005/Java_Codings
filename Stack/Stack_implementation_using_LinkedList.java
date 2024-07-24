package Stack;
public class Stack_implementation_using_LinkedList {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static class stack{
        Node head = null;
        int size = 0;
        // push method...
        public void push(int val){
            if(size == 0){
                head = new Node(val);
                size++;
            }
            else {
                Node temp = new Node(val);
                temp.next = head;
                head = temp;
                size++;
            }
        }

        // pop method...
        public int pop(){
            if(size == 0){
                System.out.println("Stack is empty...");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        // peek method...
        public int peek(){
            if(size == 0){
                System.out.println("Stack is empty...");
                return -1;
            }
            return head.val;
        }

        // isEmpty method...
        public boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }

        // display method (not an inbuilt method)...
        public void display(){
            if(size == 0){
                System.out.println("Stack is empty...");
                return ;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(1);
        System.out.println(st.peek());
        st.pop();
        st.display();

    }
}
