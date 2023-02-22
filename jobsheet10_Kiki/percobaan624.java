package jobsheet10_Kiki;
import java.util.Scanner;
public class percobaan624 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int p,l,t,Vol,L;

    System.out.println("Masukkan Panjang : ");
    p=sc.nextInt();
    System.out.println("Masukkan Lebar : ");
    l=sc.nextInt();
    System.out.println("Masukkan tinggi : ");
    t=sc.nextInt();
    L=hitungLuas(p, l);
    System.out.println("Luas persegi panjang adalah : "+L);
    Vol=hitungVolume(p, l, t);
    System.out.println("Volume balok adalah : " +Vol);

  }
  static int hitungLuas (int pjg, int lb) {
    int Luas=pjg*lb;
    return Luas;
  }
  static int hitungVolume (int b, int a, int tg) {
    int Volume=hitungLuas(a, b)*tg;
    return Volume;
  }
  
}

