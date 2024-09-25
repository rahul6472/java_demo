package tree;

public class Tree_Traversal {

    //left->root->right
    static void inorder(Node root){
        if (root == null) {
            return ;
        }
        inorder(root.left);
        System.out.println("Node found"+root.data);
        inorder(root.right);
    }
    //root->left->right
    static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.println("Node found::"+root.data);
        preorder(root.left);
        preorder(root.right);
    }
    //left->right->root
    static void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println("Node found::"+root.data);
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(10);
        root.right=new Node(15);
        root.left.left=new Node(20);
        root.left.right=new Node(25);
        root.left.right.right=new Node(45);
        root.right.left=new Node(30);
        root.right.right=new Node(35);

        inorder(root);
        System.out.println("Second traveral");
        preorder(root);
    }
}
