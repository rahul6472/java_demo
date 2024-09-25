package tree;

class Node{
    int data;
    Node left,right;

    public Node(int item){
        data=item;
        left=right=null;
    }
}
public class Level_Node_Binary {

    //return level of given data value
    static int getLevel(Node root, int data){
        return getLevelUtil(root,data,1);
    }

    //main function for finding level of given node
    static int getLevelUtil(Node root, int data, int level){
        if(root==null)
            return 0;
        if(root.data==data)
            return level;

        int downlevel=getLevelUtil(root.left,data,level+1);
        if(downlevel!=0) return downlevel;

        downlevel=getLevelUtil(root.right,data,level+1);

        return downlevel;

    }

    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(1);
        root.right.right=new Node(4);

        System.out.println("Level of Node::"+getLevel(root,4));


    }

}
