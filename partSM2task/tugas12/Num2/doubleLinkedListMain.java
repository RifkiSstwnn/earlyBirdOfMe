package tugas12.Num2;

import java.util.Scanner;

public class doubleLinkedListMain {
   public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      Scanner s1=new Scanner(System.in);
      doubleLinkedList dll=new doubleLinkedList();
      String dataMasuk;
      int id,idx;
      float rating;
      int pilih;
        do {
          menu();
          System.out.print("Insert Here : ");
          pilih = sc.nextInt();
          switch (pilih) {
            case 1:
              System.out.print("Masukkan Nama Film :");
              dataMasuk = s1.nextLine();
              sc.nextLine();
              System.out.print("Masukkan ID Film :");
              id=sc.nextInt();
              System.out.print("Masukkan Rating Film :");
              rating=sc.nextFloat();
              dll.addFirst(dataMasuk,id,rating);
              break;
            case 2:
            System.out.print("Masukkan Nama Film :");
            dataMasuk = s1.nextLine();
            sc.nextLine();
            System.out.print("Masukkan ID Film :");
            id=sc.nextInt();
            System.out.print("Masukkan Rating Film :");
            rating=sc.nextFloat();
            dll.addLast(dataMasuk,id,rating);
            break;
            case 3:
            System.out.print("Masukkan Urutan yang ingin anda tambahkan :");
            idx=sc.nextInt();
            System.out.print("Masukkan Nama Film :");
            dataMasuk = s1.nextLine();
            sc.nextLine();
            System.out.print("Masukkan ID Film :");
            id=sc.nextInt();
            System.out.print("Masukkan Rating Film :");
            rating=sc.nextFloat();
            dll.add(dataMasuk,id,rating,(idx-1));
            break;
            case 4:
            if(dll.getFirst()!=null){
              System.out.println("Data Film : "+dll.getFirst()+ " Telah dihapus");
            }
            dll.removeFirst();
              break;
            case 5:
            if(dll.getLast()!=null){
              System.out.println("Data Film : "+dll.getLast()+ " Telah dihapus");
            }
            dll.removeLast();
            break;
            case 6:
            System.out.print("Masukkan urutan film yang ingin anda hapus :");
            idx=sc.nextInt();
            if(dll.get((idx-1))!=null){
              System.out.println("Data Film : "+dll.get((idx-1))+ " Telah dihapus");
            }
            dll.remove((idx-1));
            break;
            case 7:
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("+ PLAYLIST FILM SMARIDUTA +");
            System.out.println("+++++++++++++++++++++++++++");
              dll.print();               
              System.out.println("Jumlah Playlist :"+dll.size());
              break;           
            case 8:
            System.out.println("Masukkan ID Film yang ingin anda cari :");
            id=sc.nextInt();
            dll.searcFilm(id);
            break;
            case 9:
            dll.bubbleSort();
            dll.print();
            break;
            case 10:
            break;
          }
        } while (pilih == 1 || pilih == 2 || pilih == 3||pilih==4||pilih==5||pilih==6||pilih==7||pilih==8||pilih==9);
}
public static void menu() {
  System.out.println("+ PLAYLIST FILM SMARIDUTA +");   
  System.out.println("1. Tambah data awal");
   System.out.println("2. Tambah data akhir");
   System.out.println("3. Tambah data index tertentu");
   System.out.println("4. Hapus data pertama");
   System.out.println("5. Hapus data terakhir");
   System.out.println("6. Hapus data tertentu");
   System.out.println("7. Cetak");
   System.out.println("8. Cari ID Film");
   System.out.println("9. Urut dari rating Film Desc");
   System.out.println("10. exit");
   System.out.println("-------------------------");
 }
}
