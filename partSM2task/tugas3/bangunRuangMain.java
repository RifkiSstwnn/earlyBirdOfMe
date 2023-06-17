package semester2.tugas3;

import java.util.Scanner;

public class bangunRuangMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char next = 'y';
    byte choose;
    int jumlah;
    do {
      System.out.println("SELAMAT DATANG DI PROGRAM PENGHITUNGAN VOLUME");
      System.err.print("Silahkan choose Menu\n1. Kerucut\n2. Limas Segi Empat\n3. bola\n");
      choose = sc.nextByte();
      System.out.print("Masukkan Jumlah bangun yang anda ingin hitung: ");
      jumlah = sc.nextInt();

      if (choose == 1) {
        kerucut[] arrayKerucut = new kerucut[jumlah];
        for (int i = 0; i < jumlah; i++) {
          arrayKerucut[i] = new kerucut();
          System.out.println("Masukkan data Kerucut ke " + (i + 1));
          System.out.print("Masukkan Jari-Jari: ");
          arrayKerucut[i].r = sc.nextDouble();
          System.out.print("Masukkan Sisi Miring: ");
          arrayKerucut[i].sisiMiring = sc.nextInt();

        }
        for (int i = 0; i < jumlah; i++) {
          System.out.println("Luas permukaan kerucut ke " + (i + 1) + " : " + arrayKerucut[i].luasPermukaan1());
          System.out.println("volume kerucut ke " + (i + 1) + " : " + arrayKerucut[i].volume1());
        }
      } else if (choose == 2) {
        limasS4[] arrayLimas = new limasS4[jumlah];
        for (int i = 0; i < jumlah; i++) {
          arrayLimas[i] = new limasS4();
          System.out.println("Masukkan data Limas ke " + (i + 1));
          System.out.print("Masukkan Panjang Sisi: ");
          arrayLimas[i].panjangSisi = sc.nextDouble();
          System.out.print("Masukkan tinggi Alas: ");
          arrayLimas[i].tinggiAlas = sc.nextDouble();
        }
        for (int i = 0; i < jumlah; i++) {
          System.out.println("Luas permukaan limas ke " + (i + 1) + " : " + arrayLimas[i].luasPermukaan2());
          System.out.println("volume limas ke " + (i + 1) + " : " + arrayLimas[i].volume2());
        }
      } else if (choose == 3) {
        bola[] arraybola = new bola[jumlah];
        for (int i = 0; i < jumlah; i++) {
          arraybola[i] = new bola();
          System.out.println("Masukkan data Bola ke" + (i + 1));
          System.out.print("Masukkan Jari-Jari: ");
          arraybola[i].jari2 = sc.nextInt();
        }
        for (int i = 0; i < jumlah; i++) {
          System.out.println("Luas permukaan bola ke " + (i + 1) + " : " + arraybola[i].luasPermukaan3());
          System.out.println("volume bola ke " + (i + 1) + " : " + arraybola[i].volume3());
        }
      }
      System.out.println("Apakah Anda Ingin Mengulangi Program?");
      next = sc.next().charAt(0);
    } while (next == 'y' || next == 'Y');
    sc.close();
  }
}
