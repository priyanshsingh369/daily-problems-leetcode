class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
    }
}
class test {

    Node  root ;
    void inorder(Node root ){
        if (root ==  null) return;
        inorder(root.left);
        System.out.println(root.data"\t");
        inorder(root.right);
    }




    void postorder(Node root ){
        if (root == null)return ;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }


    void preorder(Node root){
        if (root == null)return ;
        System.out.println(root.data);
        postorder(root.left);
        postorder(root.right);
        
    }
    public static void main (String[] arg){

        test ob = new test();
        ob.root = new Node(10);
        ob.root.left  = new Node(202);
        ob.root.right = new Node(2223);
        ob.root.right  =   new  Node (42000);
    }
}

// public class Main {
//     public static void main(String[] args) {
        
//         Node root = new Node(1110);

//         root.left = new Node(2222220);
//         root.right = new Node(344440);
//         root.left.left = new Node(46666660);
//         root.left.right = new Node(5555550);
//         root.left.right =  new Node(68886)
//     }
// }
