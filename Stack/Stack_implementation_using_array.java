package Stack;
public class Stack_implementation_using_array {
    static class stack{
        int[] arr = new int[10];
        int idx = 0;

        // push method...
        public void push(int val){
            if(idx == arr.length){
                System.out.println("Stack is full...");
                return;
            }
            arr[idx++] = val;
        }

        // pop method...
        public int pop(){
            if(idx == -1){
                System.out.println("Stack is empty...");
                return -1;
            }
            int top = arr[idx];
            idx--;
            return top;
        }

        // peek method...
        public int peek(){
            if(idx == 0){
                System.out.println("Stack is empty...");
                return -1;
            }
            return arr[idx-1];
        }

        // isEmpty method...
        boolean isEmpty(){
            if (idx == 0)return true;
            return false;
        }

        // display method(not an inbuilt method)...
        void display(){
            if(idx == 0){
                System.out.println("Stack is empty...");
                return;
            }
            for(int i=idx-1; i>=0; i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.display();
        System.out.println(st.peek());
    }
}
