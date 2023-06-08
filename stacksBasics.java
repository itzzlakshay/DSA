package stacks;
import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        // push keyword is used to push element in a stack
        st.push(2);
        st.push(54);
        st.push(65);
        st.push(90);
        // peek keyword is used to display peek element of stack
        System.out.println(st.peek());
        System.out.println(st);  // we can print whole stack at one time
        // pop keyword is used to pop the last element of stack
        st.pop();
        System.out.println(st);

        System.out.println("seize of stack is : " + st.size());
        System.out.println(st.isEmpty());  // booleans to check weather stack is empty or full

        //printing first element of stack
//        while(st.size() >1){
//            st.pop();
//        }
//        System.out.println(st.peek());



    }
}
