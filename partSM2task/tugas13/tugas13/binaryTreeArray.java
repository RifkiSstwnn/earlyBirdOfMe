package tugas13;
public class binaryTreeArray {
   int[] data;
   int idxLast;
   int i;

   public binaryTreeArray() {
       data = new int[10];
   }

   void populateData(int data[], int idxLast) {
       this.data = data;
       this.idxLast = idxLast;
   }

   void traverseInOrder(int idxStart) {
      if (idxStart <= idxLast) {
        traverseInOrder(2 * idxStart + 1);
        System.out.print(data[idxStart] + " ");
        traverseInOrder(2 * idxStart + 2);
      }
   }
   void add(int data){
    this.data[i]=data;
    this.i++;
   }
   void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast) {
      System.out.print(data[idxStart] + " ");
      traverseInOrder(2 * idxStart + 1);
      traverseInOrder(2 * idxStart + 2);
    }
   }
   void traversePostOrder(int idxStart) {
    if (idxStart <= idxLast) {
      traverseInOrder(2 * idxStart + 1);
      traverseInOrder(2 * idxStart + 2);
      System.out.print(data[idxStart] + " ");
    }
 }
}