package linkedList;

public class basics {

    public static void displayR(Node head){
    if(head==null) return;
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static void display (Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static class Node{
        int data;
        Node next ;   // address of next node
        Node (int data){
            this.data = data;
        }
    }

    public static int count(Node head){
        int count =0;
        while(head != null){
            count ++;
            head = head.next;
        }
        return count ;
    }

    public static void main(String[] args) {
    Node a = new Node(3);
//        System.out.println(a.data);    // print vale of data
//        System.out.println(a);         // print address of provided variable
    Node b = new Node(7);
    Node c = new Node(11);
    Node d = new Node(23);
    Node e = new Node(62);
    Node f = new Node(57);
    a.next = b ;  // linking a with b
//        System.out.println(a.next);
//        System.out.println(a.next.data);  // printing value of b through a using linked list
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;

    // printing all nodes
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);

        // printing value through for loop
        // in for loop we don't know , when we have to end the loop
//        Node temp = a;
//        for(int i = 1; i<=5; i++){
//            System.out.println(temp.data + " ");
//            temp = temp.next;
//        }

        // using while loop
//        Node temp = a;
//        while(temp!=null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        display(temp);
//        displayR(temp);

        // counting no of nodes
        System.out.println(count(a));


    }
}
