package Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Stack_implementation_using_Queues {
    static class stack {
        Queue<Integer> q = new LinkedList<>();

        // push method...
        public void push(int x) {
            q.add(x);
        }
        // pop method...
        public int pop() throws Exception{
            if(q.isEmpty()){
                throw new Exception("Stack is empty...");
            }else if(q.size() == 1){
                return q.remove();
            }else{
                int n = q.size();
                for(int i=1; i<n; i++){
                    int b = q.remove();
                    q.add(b);
                }
                return q.remove();
            }
        }

        // peek method...
        public int peek() throws Exception{
            if(q.isEmpty()){
                throw new Exception("Stack is empty...");
            }else if(q.size() == 1){
                return q.peek();
            }else{
                int n = q.size();
                for(int i=1; i<n; i++){
                    int b = q.remove();
                    q.add(b);
                }
                int c = q.remove();
                q.add(c);
                return c;
            }
        }

        // isEmpty method...
        public boolean isEmpty() {
            return q.isEmpty();
        }

        // display method(not an inbuilt method)...
        public void display()throws Exception{
            if(q.isEmpty()){
                throw new Exception("Stack is empty...");
            }
            int n = q.size();
            for(int i=0; i<n; i++){
                System.out.print(q.peek() + " ");
                q.add(q.remove());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        stack st = new stack();
        st.push(8);
        st.push(56);
        st.push(560);
        st.push(3456);
        st.display();
        System.out.println(st.pop());
        st.display();

    }
}