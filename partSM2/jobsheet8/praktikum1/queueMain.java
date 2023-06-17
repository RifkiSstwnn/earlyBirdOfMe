package semester2.jobsheet8.praktikum1;

import java.util.Scanner;

public class queueMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan kapasitas queue:");
    int n = sc.nextInt();
    queue q = new queue(n);
    int pilih;
    do {
      menu();
      pilih = sc.nextInt();
      switch (pilih) {
        case 1:
          System.out.println("Masukkan data baru:");
          int dataMasuk = sc.nextInt();
          q.enqueue(dataMasuk);
          break;
        case 2:
          int dataKeluar = q.dequeue();
          if (dataKeluar != 0) {
            System.out.println("Data yang dikeluarkan: " + dataKeluar);
            break;
          }
        case 3:
          q.print();
          break;
        case 4:
          q.peek();
          break;
        case 5:
          q.clear();
          break;
      }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
  }

  public static void menu() {
    System.out.println("1. Enqueue");
    System.out.println("2. Dequeue");
    System.out.println("3. Print");
    System.out.println("4. Peak");
    System.out.println("5. Clear");
    System.out.println("-------------------------");
  }
}
