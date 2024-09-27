package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTraversal {

    static void printLevelOrderTraversal(Node root){
        int h=heightTree(root);
        for(int i=1;i<=h;i++){
            printNodes(root,i);
        }
    }

    static int heightTree(Node root){
        if(root==null) return 0;
        else {
            int lheight=heightTree(root.left);
            int rheight=heightTree(root.right);
            if(lheight>rheight) return lheight+1;
            else return rheight+1;
        }

    }

    static void printNodes(Node root, int level){
        if(root==null) return;
        if(level==1) System.out.println(" "+root.data);
        else if(level>1){
            printNodes(root.left,level-1);
            printNodes(root.right,level-1);
        }
    }
    static void printLevelOrderTraversalQueue(Node root){
        if(root==null) return;
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp=queue.poll();
            System.out.println("::"+temp.data);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }

        }
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

//       printLevelOrderTraversal(root);
       printLevelOrderTraversalQueue(root);

    }
}
