package BinarySearchTree;

class Node{
    int data;
    Node left,right;
    public Node(int item){
        data=item;
        left=right=null;
    }
}
public class BSToperation {

    //function for searching node in binary search tree
    static Node searchNode(Node root,int key){
        if(root==null || root.data==key) return root;
        if(key<root.data) {
            return searchNode(root.left,key);
        }
         return searchNode(root.right,key);
    }

    //function for inserting node in binary search tree
    static Node insert(Node root, int item){

        if (root==null) return new Node(item);
        if(root.data==item) return root;

        if(item<root.data) root.left=insert(root.left,item);
        else root.right=insert(root.right,item);

        return root;
    }

    //function for deleting node in binary search tree


    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(12);
        root.right=new Node(15);
        root.left.left=new Node(20);
        root.left.right=new Node(25);
        root.left.right.right=new Node(45);
        root.right.left=new Node(30);
        root.right.right=new Node(35);

    }
}
