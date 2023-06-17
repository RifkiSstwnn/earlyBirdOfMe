package tugas13;
import java.util.Scanner;

public class binaryTreeArrayMain {
   public static void main(String[] args) {
       binaryTreeArray bta = new binaryTreeArray();
       Scanner sc=new Scanner(System.in);
       System.out.print("Masukkan Panjang Array : ");
       int node=sc.nextInt();
       int[] data=new int [node];
       System.out.print("Masukkan Batas array yang akan ditampilkan : ");
       int batas=sc.nextInt();
       //int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
       //int idxLast = 6;
      
       for(int i=0;i<data.length;i++){
        System.out.print("Masukkan Data Array " +i+ " : ");
        data[i]=sc.nextInt();
        bta.add(data[i]);
       }
       bta.populateData(data, batas);
       bta.traverseInOrder(0);
       System.out.println("");
       bta.traversePostOrder(0);
       System.out.println("");
       bta.traversePreOrder(0);
   }
}