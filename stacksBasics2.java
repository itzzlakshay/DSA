package stacks;
import java.util.Stack;

public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();

        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.print(x + " ");
            st.push(x);
        }

        System.out.println();

        int n = st.size();
        int []arr = new int[n];
        for(int i=n-1; i>=0;i--){
            arr[i] = st.pop();
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }

      
      
      // inserting value at some index
      int idx =3;
        int val = 7;

        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(val);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);

    }
}
