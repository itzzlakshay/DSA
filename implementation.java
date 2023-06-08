package linkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node (val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead ( int val) {
            Node temp = new Node(val);
            if (head == null){
                head  = tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt (int idx, int val){
            Node t = new Node (val);
            Node temp = head;
            for(int i =0; i<idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next =t;
        }

        int getAt(int idx){
            Node temp = head;
            for (int i =1;i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }



        void display(){
            while(head!=null){
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
        int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
                count ++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main (String[] args){
    linkedList ll = new linkedList();
    ll.insertAtEnd(4);
    ll.insertAtEnd(5);
    ll.display();
//    ll.insertAtHead(1);
        ll.insertAtEnd(7);
//      ll.insertAtHead(2);
//        ll.insertAt(2,44);
    ll.display();
        System.out.println(ll.getAt(1));

    }
}
