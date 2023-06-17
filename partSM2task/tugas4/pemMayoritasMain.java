package semester2.tugas4;

import java.util.Scanner;

public class pemMayoritasMain {
  public static void main(String[] args) {
    pemMayoritas inp = new pemMayoritas();
    Scanner sc = new Scanner(System.in);

    System.out.println("\nSelamat Datang di Program Voting");
    System.out.println("-----------------------------------------");
    System.out.print("Masukkan Jumlah Pemilih : ");
    int jumlahPemilih = sc.nextInt();
    int[] panjang = new int[jumlahPemilih];
    System.out.println("-----------------------------------------");
    System.out.println("Silahkan Pilih Kandidat Calon Ketua");
    System.out.print("1. Haris\n2. Dian\n3. Rani\n4. Bisma\n");
    System.out.println("-------------------------------------------");
    for (int i = 0; i < jumlahPemilih; i++) {
      System.out.print("Pemilih " + (i + 1) + ", Masukkan calon ketua pilihan Anda: ");
      panjang[i] = sc.nextInt();
      if (panjang[i] > 4) {
        System.out.println("Input tidak sah");
      }
    }
    int mayoritas = inp.cariPemMayoritas(panjang, jumlahPemilih);
    int hitungMayoritas = inp.hitung(panjang, jumlahPemilih, mayoritas);
    int minMayoritas = (jumlahPemilih / 2) + 1;
    if (hitungMayoritas >= minMayoritas) {

      System.out.println("Mayoritas Suara Adalah Kandidat Nomor " +
          mayoritas + ", Dengan Jumlah Suara " + hitungMayoritas);
    } else {

      System.out.println("Tidak Ada Syarat Yang Terpenuhi");
    }
  }
}
