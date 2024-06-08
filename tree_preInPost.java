package trees;

import java.util.LinkedList;
import java.util.Queue;

public class preInPost {

    public static void pip(int n){
        if(n==0) return ;
        System.out.println("pre" +n);
        pip(n-1);
        System.out.println("in" + n);
        pip(n-1);
        System.out.println("post" + n);
    }

    public static class Node {
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val = val;
        }
    }

    public static void preorder(Node root){
        if(root == null) return ;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
     }

    public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void nthLevel (Node root, int n){
        if(root == null) return ;
        if(n==1) System.out.print(root.val + " ");
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }

    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!= null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();

        }
    }

    

    public static void main(String[] args) {
//        pip(3);

        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(6);
        Node f = new Node(7);
        b.right= f;
        b.left = e;

//        preorder(root);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
        nthLevel(root,3);

//        bfs(root);
    }
}
