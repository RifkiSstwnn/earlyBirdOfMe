package semester2.tugas3;

import java.util.Scanner;

public class dataMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Mahasiswa : ");
    int jumlah = sc.nextInt();
    data[] mahasiswa = new data[jumlah];
    for (int i = 0; i < jumlah; i++) {
      mahasiswa[i] = new data();
      System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
      mahasiswa[i] = new data();
      System.out.print("Masukkan Nama : ");
      mahasiswa[i].nama = sc.next();
      System.out.print("Masukkan NIM : ");
      mahasiswa[i].nim = sc.next();
      System.out.print("Masukkan Jenis Kelamin : ");
      mahasiswa[i].kelamin = sc.next();
      System.out.print("Masukkan IPK : ");
      mahasiswa[i].ipk = sc.next();
    }
    for (int i = 0; i < jumlah; i++) {
      System.out.println("Data Mahasiswa ke-" + (i + 1));
      mahasiswa[i].tampilData();
    }
    sc.close();
  }
}
