package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;

    public Node(int item){
        data=item;
        left=right=null;
    }
}

//BinaryTree class
public class BinaryTreeOps {

    //Dfs traverse depth as far down a branch possible before backtracking
    static void inorderDFS(Node root){
        if(root==null) return;

        inorderDFS(root.left);
        System.out.println("Print Node:: "+root.data);
        inorderDFS(root.right);
    }

    //DFS method of traversing using preorder recursion since dfs is implmented using recusrsion
    static void preorderDFS(Node root){
        if (root==null) return;
        System.out.println("Print Node ::"+root.data);
        preorderDFS(root.left);
        preorderDFS(root.right);
    }

    //Dfs function for traversing tree using postorder method
    static void postorderDFS(Node root){
        if (root==null) return;
        postorderDFS(root.left);
        postorderDFS(root.right);
        System.out.println("Print Node:: "+root.data);
    }

    //BFs level order traversla
    static void BFS(Node root){
        if (root==null) return;

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            System.out.println("Print Node::"+root.data);
            if(root.left!=null) queue.add(root.left);
            if (root.right!=null) queue.add(root.right);
        }
    }

    //function for inserting a new node in binary tree
    static Node insertNodeBinaryTree(Node root,int key){
        if(root==null) return new Node(key);

        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp=queue.poll();

            //if left side of node is empty then insert it to left side
            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }else {
                queue.add(temp.left);
            }
            //if right side of child is empty then insert new node
            if(temp.right==null){
                temp.right= new Node(key);
                break;
            }else {
                queue.add(temp.right);
            }
        }
        return root;
    }

    //function for searching node in binary tree using dfs
    static boolean searchNode(Node root, int value){
        if(root==null) return false;

        if (root.data==value) return true;
        boolean leftSide=searchNode(root.left,value);
        boolean rightSide=searchNode(root.right,value);

        return leftSide|| rightSide;
    }

    //Deletion of node in binary tree
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
