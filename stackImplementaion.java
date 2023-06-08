// implementation of stack by Array and Linked List

package stacks;

public class Implementation {
    
    // implementation using array
    public static class stack{
        int[] arr = new int[5];
        int idx = 0;

        void push(int x){
            arr[idx] =x;
            idx++;
        }

        int peek(){
            if(idx==0) {
                System.out.println("stack is empty ");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0) {
                System.out.println("stack is empty ");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] =0;
            idx--;
            return top;
        }

        void display (){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

    }
  
  
  // implementaion using Linked list
  public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LLstack {
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("stack is empty ");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("stack is empty ");
                return -1;
            }
            return head.val;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
    stack st = new stack();
    st.push(3);
    st.push(7);
    st.push(21);
    st.push(43);
    st.push(38);
    st.display();

    st.pop();
    st.display();

    st.peek();
    st.size();


    }
}
