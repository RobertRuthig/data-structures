/**
   This class demonstrates the tree class.
*/
public class TreeDemo
{
   public static void main(String[] args)
   {
      Tree t1 = new Tree("Anne");
      Tree t2 = new Tree("Peter");
      t1.addSubtree(t2);
      Tree t3 = new Tree("Zara");
      t1.addSubtree(t3);
      Tree t4 = new Tree("Savannah");
      t2.addSubtree(t4);
      System.out.println("Size: " + t1.size());
      BinaryTree t5 = new BinaryTree("1");
      BinaryTree t6 = new BinaryTree("1");
      BinaryTree t7 = new BinaryTree("1",t5,t6);
      BinaryTree t8 = new BinaryTree("1",t7, new BinaryTree());
      BinaryTree t9 = new BinaryTree("1",t8, new BinaryTree());
      System.out.println(t9.singleChildNodes());
   }
}
