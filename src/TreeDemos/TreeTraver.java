package TreeDemos;

class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class TreeTraver
{

    Node root;

    TreeTraver()
    {
        root = null;
    }


    void printPostorder(Node node)
    {
        if (node == null)
            return;


        printPostorder(node.left);


        printPostorder(node.right);


        System.out.print(node.key + " ");
    }


    void printInorder(Node node)
    {
        if (node == null)
            return;


        printInorder(node.left);


        System.out.print(node.key + " ");


        printInorder(node.right);
    }


    void printPreorder(Node node)
    {
        if (node == null)
            return;

        System.out.print(node.key + " ");


        printPreorder(node.left);


        printPreorder(node.right);
    }

    // Wrappers over above recursive functions
    void printPostorder()  {     printPostorder(root);  }
    void printInorder()    {     printInorder(root);   }
    void printPreorder()   {     printPreorder(root);  }


    public static void main(String[] args)
    {
        TreeTraver tree = new TreeTraver();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right=new Node(6);

        System.out.println("Preorder traversal is ");
        tree.printPreorder();

        System.out.println("\n Inorder traversal is ");
        tree.printInorder();

        System.out.println("\n Postorder traversal is ");
        tree.printPostorder();
    }
}