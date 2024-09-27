package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertionBinaryTree {

    static Node insertNode(Node root,int key){
        Queue<Node>queue=new LinkedList<>();
        if(root==null){
            root=new Node(key);
            return root;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp=queue.poll();
            if(temp.left==null){
                temp.left=new Node(key);

            }else{
                queue.add(temp.left);
            }
            if(temp.right==null){
                temp.right=new Node(key);
            }
            else {
                queue.add(temp.right);
            }
        }

      return root;
    }
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
