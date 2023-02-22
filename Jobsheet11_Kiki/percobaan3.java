package Jobsheet11_Kiki;

import java.util.function.DoubleUnaryOperator;
import java.util.Scanner;
public class percobaan3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Jumlah Saldo awal : ");
    int saldoAwal=sc.nextInt();
    System.out.print("Lamanya investasi (tahun) : ");
    int tahun=sc.nextInt();
    System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
    System.out.print(hitungLaba(saldoAwal, tahun));
  }
  static double hitungLaba(double saldo, int tahun) {
    if (tahun==0) {
      return saldo;
    } else {
      return (1.11*hitungLaba(saldo, tahun-1));
    }
  }
}
