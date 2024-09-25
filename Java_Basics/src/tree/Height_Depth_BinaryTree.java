package tree;
public class Height_Depth_BinaryTree {

    //function for finding the depth of given node
    static int findDepth(Node root,int x){
        if(root==null){
            return -1;
        }

        int dist=-1;
        if((root.data==x) || (dist=findDepth(root.left,x))>=0|| (dist=findDepth(root.right,x))>=0)
            return dist+1;

        return dist;
    }

    //finding the height of binary tree
    static int findHeight(Node root){
        if(root==null)
            return -1;
        int left=findHeight(root.left);
        int right=findHeight(root.right);
        return Math.max(left,right)+1;
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
        System.out.println("Depth::"+findDepth(root,45));

        System.out.println("Height of tree"+findHeight(root));


    }
}
