package semester2.jobsheet7.praktikum1;

import java.util.Scanner;

public class stackMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    stack stck = new stack(5);
    
    byte pilih;
    do {
      System.out.print("Jenis : ");
      String jenis = sc.nextLine();
      System.out.print("Warna : ");
      String warna = sc.nextLine();
      System.out.print("merk : ");
      String merk = sc.nextLine();
      System.out.print("ukuran : ");
      String ukuran = sc.nextLine();
      System.out.print("harga : ");
      double harga = sc.nextDouble();
      pakaian p = new pakaian(jenis, warna, merk, ukuran, harga);
      System.out.println("Apakah yang anda ingin lakukan?\n1. push\n2. print\n3. pop\n4. peek\n5. Print Harga terendah ");
      stck.push(p);
      pilih = sc.nextByte();
      if (pilih == 2) {
        stck.print();
      } else if (pilih == 3) {
        stck.pop();
      } else if (pilih == 4) {
        stck.peek();
      } else if(pilih==5){
stck.getMin();

      }
      sc.nextLine();
    } while (pilih == 1);
    System.out.println();
  }
}
