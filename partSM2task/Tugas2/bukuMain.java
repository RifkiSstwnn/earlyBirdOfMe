package semester2.Tugas2;

import java.util.Scanner;

public class bukuMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    buku book = new buku();
    book.hargaSatuan = 35000;
    System.out.println("Masukkan Jumlah buku yang ingin anda beli : ");
    book.jumlah = sc.nextInt();
    book.nama = "Kala Senja ada pada malam";
    book.penerbit = "Sipuan";
    book.pengarang = "Tejo";
    int all = book.hitungHargaTotal();
    int diskon = book.hitungDiskon(all);
    int bayar = book.hitungHargaBayar(diskon, all);
    System.out.println("-------------------");
    System.out.println("Total : " + all + "\nDiskon : - " + diskon + "\nBayar : " + bayar);
    sc.close();
  }
}
