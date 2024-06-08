package trees;

public class sizeSumMaxHeight {

    public static class Node {
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left) + size(root.right);
    }

    public static int sum (Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int max (Node root){
        if(root == null) return 0;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);

        return Math.max(a, Math.max(b,c));
    }

    public static int height (Node root){
        if(root == null || (root.right==null && root.left==null )) return 0;
        return 1 + Math.max(height(root.left) ,height(root.right));
    }

    public static int product (Node root){
        if (root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    public static int min (Node root){
        if(root==null) return 0;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a, Math.min(b,c));
    }

    public static void main(String[] args) {
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
        b.right= e;
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
        System.out.println(product(root));
        System.out.println(min(root));

    }
}
