package semester2.jobsheet8.praktikum2;

import java.util.Scanner;

public class queueMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan Kapasitas queue:");
    int jumlah = sc.nextInt();
    queue antri = new queue(jumlah);
    int pilih;
    do {
      menu();
      pilih = sc.nextInt();
      sc.nextLine();
      switch (pilih) {
        case 1:
          System.out.println("No Rekening: ");
          String norek = sc.nextLine();
          System.out.println("Nama: ");
          String nama = sc.nextLine();
          System.out.println("Alamat: ");
          String alamat = sc.nextLine();
          System.out.println("Umur: ");
          int umur = sc.nextInt();
          System.out.println("Saldo: ");
          double saldo = sc.nextDouble();
          Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
          sc.nextLine();
          antri.enqueue(nb);
          break;

        case 2:
          Nasabah data = antri.dequeue();
          if (!"".equals(data.norek) && !"".equals(data.norek) && !"".equals(data.norek) && data.umur != 0
              && data.saldo != 0) {
            System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " "
                + data.umur + " " + data.saldo);
          }
          ;
          break;
        case 3:
          antri.peek();
          break;
        case 4:
          antri.print();
          break;
        case 5:
          antri.peekRear();
          break;
      }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
  }

  public static void menu() {
    System.out.println("Pilih Menu:");
    System.out.println("1. Antrian Baru");
    System.out.println("2. Antrian Keluar");
    System.out.println("3. Cek Antrian terdepan");
    System.out.println("4. Cek Semua antrian");
    System.out.println("5. Cek Antrian terbelakang");
    System.out.println("-------------------------------------");
  }
}
