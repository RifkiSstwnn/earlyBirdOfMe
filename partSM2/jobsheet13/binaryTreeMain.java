public class binaryTreeMain {
   public static void main(String[] args) {
       binaryTree bt = new binaryTree();

       bt.add(6);
       bt.add(4);
       bt.add(8);
       bt.add(3);
       bt.add(5);
       bt.add(7);
       bt.add(9);
       bt.add(10);
       bt.add(15);

       bt.traversePreOrder(bt.root);
       System.out.println("");
       bt.traversePreOrder(bt.root);
       System.out.println("");
       bt.traversePostOrder(bt.root);
       System.out.println("");
       System.out.println("Find " + bt.find(5));
       bt.delete(8);
       bt.traversePreOrder(bt.root);
       System.out.println("");
   }
}
