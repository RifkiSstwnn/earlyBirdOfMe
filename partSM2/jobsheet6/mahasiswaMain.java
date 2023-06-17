package semester2.jobsheet6;

import java.util.Scanner;

import javax.xml.transform.Source;

import semester2.tugas3.data;

public class mahasiswaMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sl = new Scanner(System.in);
    System.out.println("Masukkan Jumlah Mahasiswa : ");
    int jumMhs = sc.nextInt();
    pencarianMhs data = new pencarianMhs(jumMhs);

    System.out.println("----------------------------------------");
    System.out.println("Masukkan data mahasiswa, secara urut dari NIM terkecil hingga terbesar : ");
    for (int i = 0; i < jumMhs; i++) {
      System.out.println("-----------------");
      System.out.println("Nim\t : ");
      int nim = sc.nextInt();
      System.out.println("Nama\t  :");
      String nama = sl.nextLine();
      System.out.println("Umur\t  :");
      int umur = sc.nextInt();
      System.out.println("IPK\t  :");
      double ipk = sc.nextDouble();

      mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
      data.tambah(m);
    }
    System.out.println("---------------------------------------");
    System.out.println("Data Keseluruhan Mahasiswa : ");
    data.tampil();

    System.out.println("---------------------------------------");
    System.out.println("Pencarian Data : ");
    System.out.println("Masukkan NIM mahasiswa yang akan dicari : ");
    System.out.println("NIM : ");
    int cari = sc.nextInt();
    System.out.println("Menggunakan Sequential Search");
    int posisi = data.findSeqSearch(cari);
    data.tampilPosisi(cari, posisi);
    data.tampilData(cari, posisi);

    System.out.println("---------------------------------------");
    System.out.println("Menggunakan Binary Search");
    data.selectionSort();
    posisi = data.findBinarySarch(cari, 0, jumMhs - 1);
    data.tampilPosisi(cari, posisi);
    data.tampilData(cari, posisi);
  }
}
