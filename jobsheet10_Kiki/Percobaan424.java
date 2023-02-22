package jobsheet10_Kiki;
import java.util.Scanner;

public class Percobaan424 {
  public static void main(String[] args) {
    int nilai1, nilai2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Masukan Nilai 1 : ");
    nilai1=sc.nextInt();
    System.out.println("Masukkan Nilai 2 : ");
    nilai2=sc.nextInt();
    int hasil=kurang (nilai1, nilai2);
    System.out.println("Hasil Akhir adalah "+hasil);
    int hasil1=tambah(nilai1,nilai2);
    System.out.println("Hasil akhir yang kedua adalah  "+hasil1);

  }
  static int kurang (int a, int b) {
    int x;
    a=a+7;
    b=b+4;
    x=kali(a, b);
    return x;
  }
  static int kali (int c, int d) {
    int h;
    h=(c+10)%(d+19);
    return h;
  }
  static int tambah (int v, int w) {
   int x,y,z;
   x=v*w;
   y=v-w;
   z=x+y;
   return z;
  }
  
  
}
