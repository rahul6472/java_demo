package tree;

public class Parent_Of_Node {
    //function for finding parent node
    static  void findParent(Node root,int val,int parent){
        if(root==null)
          return;
        if(root.data==val){
            System.out.println("Parent node"+parent);
        }
        findParent(root.left,val,root.data);
        findParent(root.right,val,root.data);
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

        findParent(root ,45,-1);
    }
}
