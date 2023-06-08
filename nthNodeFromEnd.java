package linkedList;

public class nthNodeFromEnd {

    public static node nthNode (node head, int x){
        int count =0;
        node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int a = count-x+1;   // a is nth element from last
        temp = head;
        for(int i=1; i<a; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static node nthNode2 (node head , int n){
        node slow = head;
        node fast = head;
        for(int i =1; i<=n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static node deleteNthFromEnd (node head , int n){
        node slow = head;
        node fast = head;
        for(int i=0; i<=n; i++){
            fast = fast.next;
        }

        if(fast==null){
        head = head.next;
        return head;

        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static node intersection ( node head1 , node head2 ){
        node temp1 = head1;
        node temp2 = head2;
        int a = length(head1);
        int b = length(head2);

        if(a>b){
            int step =a-b;
            for(int i=1; i<=step;i++){
                temp1=temp1.next;
            }
        }
        else{
            int step =b-a;
            for(int i=1; i<=step;i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }

    public static node middleOfLL (node head){
        node slow = head;
        node fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static node deleteMiddle (node head){
        node slow = head;
        node fast = head;

        if(fast.next==null){
            return null;
        }
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static node mergeTwoList (node list1, node list2){
        node temp1 = list1;
        node temp2 = list2;
        node head = new node(100);
        node temp = head;

        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                node a = new node (temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }
            else{
                node a = new node (temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }

        if(temp1==null){
            temp.next = temp2;
        }
        else{
            temp.next = temp1;
        }
        return head.next;
    }

    public static node removeDuplicateU (node head){
        node temp = head;
        if(head == null || head.next == null) return head;

        while( temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }  return head;
    }

    public static node reverse(node head){
        node curr = head;
        node prev = null;
        node after = null;
        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            after = curr;
            curr = after;
        }
        return prev;
    }

    public static void display (node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int length(node head){
        int count =0;
        while(head!=null){
            head = head.next;
            count ++;
        }
        return count;
    }

    public static class node{
        int data ;
        node next;
        node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        node a = new node(100);
        node b = new node(12);
        node c = new node(3);
        node d = new node(56);
        node e = new node(67);

        node f = new node(23);
        node g = new node(32);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        f.next = g;
        g.next = d;

//        node q = nthNode(a,2);
//        System.out.println(q.data);
//
//        node p = nthNode2(a,2);
//        System.out.println(p.data);
//
//       a = deleteNthFromEnd(a,4);
//        display(a);

//        b = intersection(a,f);
//        System.out.println(b.data);
//
//        c = middleOfLL(a);
//        System.out.println(c.data);
//
//        d = deleteMiddle(a);
//        display(d);



    }
}
