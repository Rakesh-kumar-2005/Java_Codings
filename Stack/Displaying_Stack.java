package Stack;
import java.util.Stack;
public class Displaying_Stack {

    // displaying straight...
    public static void display(Stack<Integer> st){
        Stack<Integer> helper = new Stack<>();
        while(!st.isEmpty()){
            System.out.print(st.peek() + " ");
            helper.push(st.pop());
        }
        System.out.println();
        while (!helper.isEmpty()){
            st.push(helper.pop());
        }
    }

    // reverse displaying...
    public static void displayReverse(Stack<Integer> st){
        Stack<Integer> helper = new Stack<>();
        while(!st.isEmpty()){
            helper.push(st.pop());
        }
        while (!helper.isEmpty()){
            System.out.print(helper.peek() + " ");
            st.push(helper.pop());
        }
        System.out.println();
    }

    // display using recursion...
    public static void displayRecursively(Stack<Integer> st){
        if(st.isEmpty()) return;
        int temp = st.pop();
        System.out.print(temp + " ");
        displayRecursively(st);
        st.push(temp);
    }

    // display reversely using recursion...
    public static void displayReverseRecursively(Stack<Integer> st){
        if(st.isEmpty()) return;
        int temp = st.pop();
        displayReverseRecursively(st);
        System.out.print(temp + " ");
        st.push(temp);
    }

    // Reverse a Stack...
    public static void reverse(Stack<Integer> st){
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        while(!st.isEmpty())
            temp1.push(st.pop());
        while (!temp1.isEmpty())
            temp2.push(temp1.pop());
        while (!temp2.isEmpty())
            st.push(temp2.pop());
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(32);
        st.push(33432);
        st.push(335);
        st.push(3348);
        st.push(3875);
        display(st);
        displayReverse(st);
        displayRecursively(st);
        System.out.println();
        displayReverseRecursively(st);
        System.out.println();
        reverse(st);
        display(st);
    }
}
