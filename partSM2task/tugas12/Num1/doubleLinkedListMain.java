package tugas12.Num1;

import java.util.Scanner;

public class doubleLinkedListMain {
   public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      Scanner s1=new Scanner(System.in);
      doubleLinkedList dll=new doubleLinkedList();
      System.out.println("DAFTAR VAKSIN");
      int pilih;
        do {
          menu();
          System.out.print("Insert Here : ");
          pilih = sc.nextInt();
          switch (pilih) {
            case 1:
              System.out.print("Masukkan data baru :");
              String dataMasuk = s1.next();
              sc.nextLine();
              System.out.print("Masukkan Nomor Antrean :");
              int antrean=s1.nextInt();
              dll.addLast(dataMasuk,antrean);
              break;
            case 2:
            if (dll.getFirst()!=null) {
               System.out.println( dll.getFirst()+" Telah divaksinasi");
               dll.removeFirst();
               System.out.println("+++++++++++++++++++++++++++");
               System.out.println("+ DAFTAR PENGANTRE VAKSIN +");
               System.out.println("+++++++++++++++++++++++++++");

               dll.print();
               System.out.println("Sisa antrean "+dll.size());
            }
              break;
            case 3:
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("+ DAFTAR PENGANTRE VAKSIN +");
            System.out.println("+++++++++++++++++++++++++++");
              dll.print();               
              System.out.println("Sisa antrean "+dll.size());
              break;
            case 4:
              break;
          }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
}
public static void menu() {
   System.out.println("1. Tambahkan penerima vaksin");
   System.out.println("2. Kurangi penerima vaksin");
   System.out.println("3. Daftar Penerima Vaksin");
   System.out.println("4. exit");
   System.out.println("-------------------------");
 }
}
