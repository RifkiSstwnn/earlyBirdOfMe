package tugas13;
public class binaryTreeMain {
   public static void main(String[] args) {
       binaryTree bt = new binaryTree();

       bt.rekursif(bt.root,6);
       bt.rekursif(bt.root,4);
       bt.rekursif(bt.root,8);
       bt.rekursif(bt.root,3);
       bt.rekursif(bt.root,5);
       bt.rekursif(bt.root,7);
       bt.rekursif(bt.root,9);
       bt.rekursif(bt.root,10);
       bt.rekursif(bt.root,15);

      
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
       System.out.println("Nilai yang paling kecil : "+bt.min(bt.root));
       System.out.println("Nilai yang paling besar : "+bt.max(bt.root));
       System.out.println("Nilai Leaf adalah : "); 
       bt.leaf(bt.root);
       System.out.println("");
       System.out.println("Jumlah Leaf adalah : "+bt.jumlahLeaf());




   }
}
