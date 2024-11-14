import java.util.ArrayList;
import java.util.List;

/**
    Add a method void depthFirst(Visitor v) to the Tree class of
    Section 17.4 (below).
    Keep visiting until the visit method returns false.
*/
public class Tree
{
    private Node root;

    class Node
    {
        public Object data;
        public List<Node> children;

        /**
            Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree
        */
        public int size()
        {
            int sum = 0;
            for (Node child : children) { sum = sum + child.size(); }
            return 1 + sum;
        }
    }

    /**
        Constructs an empty tree.
    */
    public Tree()
    {
        root = null;
    }
    
    /*
     * Traverse this tree in preorder.
     * @param v: The visitor to be invoked on each node.
     */
    public void depthFirst(Visitor v) {
        Tree.depthFirst(this.root, v);
    }

    /*
     * Traverse the tree with a given root in preorder.
     * @param n: The root of the tree to traverse.
     * @param v: The visitor to be invoked on each node.
     */
    private static boolean depthFirst(Node n, Visitor v) {
        if (n == null) {
            return true;
        }
        if(v.visit(n.data) == false)
        {
            return false;
        }
        for (Node child: n.children) {
            if(Tree.depthFirst(child, v ) == false)
                return false;
        }
        return true;
    }

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public Tree(Object rootData)
    {
        root = new Node();
        root.data = rootData;
        root.children = new ArrayList<>();
    }

    /**
        Adds a subtree as the last child of the root.
    */
    public void addSubtree(Tree subtree)
    {
        root.children.add(subtree.root);
    }

    /**
        Computes the size of this tree.
        @return the number of nodes in the tree
    */
    public int size()
    {
        if (root == null) { return 0; }
        else { return root.size(); }
    }

    // Additional methods will be added in later sections.
}
