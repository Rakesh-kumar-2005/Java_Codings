
/* it's actually a common question for the use of stack.
   so the question is to return a true or false value.
   In a String(only of brackets) for every opening bracket('(') there should be a closing
   bracket(')') in order , if not then it'll return false...*/
package Stack;
import java.util.Stack;
public class Balance_brackets {

    /*So the process is - we have traverse the whole String , and if the character is '(' then
     we have to push into a stack and if we face a closing bracket then we would pop it , and if
     the size of the stack reaches to zero in the middle of the loop then we return it's false,
     otherwise at the end of the operation we will return the boolean value of the size of the stack ,
     bcz we know for every closing bracket there should be a closing bracket, if not then the stack won't
     be empty so the value answer will be false...*/
    public static boolean balanceBrackets(String st){
        Stack<Character> helper = new Stack<>();
        int n = st.length();
        for (int i=0; i<n; i++){
            char c = st.charAt(i);
            if(c == '(') helper.push(c);
            else {
                if(helper.isEmpty()) return false;
                helper.pop();
            }
        }
        return helper.isEmpty();
    }
    public static void main(String[] args) {
        String st = "(())(())()";
        System.out.println(balanceBrackets(st));
    }
}
