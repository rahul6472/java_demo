package tree;

public class Search_Node {

    //function for checking node exist or nor
    static boolean findNode(Node root, int data){
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        boolean flag=findNode(root.left,data);
        if(flag) return true;
        boolean flag2= findNode(root.right,data);
        return flag2;
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

        if(findNode(root,35)){
            System.out.println("Node is found in following tree");
        }
        else {
            System.out.println("Node is not found in given tree");
        }

    }
}
