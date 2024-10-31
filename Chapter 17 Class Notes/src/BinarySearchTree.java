/**
    This class implements a binary search tree whose
    nodes hold objects that implement the Comparable
    interface.
*/
public class BinarySearchTree
{   
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinarySearchTree()
    {   
        
    }
    
    /**
        Inserts a new node into the tree.
        @param obj the object to insert
    */
    public void add(Comparable obj) 
    {   
        
    }

    /**
        Tries to find an object in the tree.
        @param obj the object to find
        @return true if the object is contained in the tree
    */
    public boolean find(Comparable obj)
    {
        return false;
    }
    
    /**
        Tries to remove an object from the tree. Does nothing
        if the object is not contained in the tree.
        @param obj the object to remove
    */
    public void remove(Comparable obj)
    {
        
    }
    
    /**
        Prints the contents of the tree in sorted order.
    */
    public void print()
    {   
        
    }   

    /**
        Prints a node and all of its descendants in sorted order.
        @param parent the root of the subtree to print
    */
    private static void print(Node parent)
    {   
        
    }

    /**
        A node of a tree stores a data item and references
        to the left and right child nodes.
    */
    static class Node
    {   
        

        /**
            Inserts a new node as a descendant of this node.
            @param newNode the node to insert
        */
        public void addNode(Node newNode)
        {   
            
        }
    }

    public int singleChildNodes(Node root)
    {
        int count = 0;
        if(this.root == null)
            return 0;
        else
        {
            if(!((root.left == null && root.right == null) || (root.left != null && root.right != null)))
            {
               count ++; 
            }
            count += singleChildNodes(root.left);
            count += singleChildNodes(root.right);
        }
        return count;
    }

    public int singleChildNodes()
    {
        int count = 0;
        if(this.root == null)
            return 0;
        else
        {
            if(!((this.root.left == null && this.root.right == null) || (this.root.left != null && this.root.right != null)))
            {
               count ++; 
            }
            count += singleChildNodes(root.left);
            count += singleChildNodes(root.right);
        }
        return count;
    }
}



