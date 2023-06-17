package semester2.jobsheet6.mergeSortTest;

import java.util.Scanner;

public class sortMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sl = new Scanner(System.in);
    mergeSorting list = new mergeSorting();
    mahasiswaMerge m1 = new mahasiswaMerge("Budi", 224163, 3.8, 2020);
    mahasiswaMerge m2 = new mahasiswaMerge("Bandi", 224162, 3.81, 2020);
    mahasiswaMerge m3 = new mahasiswaMerge("Budi", 224163, 3.38, 2020);
    mahasiswaMerge m4 = new mahasiswaMerge("Kardi", 224150, 3.98, 2020);
    mahasiswaMerge m5 = new mahasiswaMerge("Supri", 224180, 3.7, 2020);
    mahasiswaMerge m6 = new mahasiswaMerge("Susan", 224111, 3.83, 2020);
    list.tambah(m6);
    list.tambah(m5);
    list.tambah(m4);
    list.tambah(m3);
    list.tambah(m2);
    list.tambah(m1);

    // int[] data = { 10, 40, 30, 50, 70, 20, 90, 100 };
    System.out.println("Sorting Dengan Merge Sort : ");
    System.out.println("----------------------------------------------");
    System.out.println("Data Awal : ");
    System.out.println("----------------------------------------------");
    list.tampil();

    System.out.println("----------------------------------------------");
    System.out.println("Setelah diurutkan");
    System.out.println("----------------------------------------------");
    list.mergeSort();
    list.tampil();
    char ulangi = 'y';
    int pilih, find;
    String cari;
    do {
      System.out.println("Searching apakah yang anda ingin jalankan\n1. Binary Search\n2. Sequential Search");
      pilih = sc.nextInt();
      if (pilih == 1) {
        System.out.println("Masukkan NIM yang ingin anda cari : ");
        find = sc.nextInt();
        int posisi = list.FindBinarySearch(find, 0, list.idx);
        list.tampilData(posisi);

      } else if (pilih == 2) {
        System.out.println("Masukkan Nama yang ingin anda cari : ");
        cari = sl.nextLine();
        list.findSeqSearch(cari);
        sc.nextLine();
      }
      System.out.println("Apakah Anda ingin mengulangi program ? y/n ");
      ulangi = sc.next().charAt(0);
    } while (ulangi == 'y');
    sc.close();
  }
}
