package jobsheet10_Kiki;
import java.util.Scanner;
public class Tugas10_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Masukkan panjang sisi yang anda inginkan : ");
    int sisi=sc.nextInt();
    int volume1 = hitungVolume(sisi);
    int luasPermukaan = hitungLuasPermukaan(sisi);
    System.out.printf("Hasil luas permukaan adalah %s dan luas volume adalah %s",luasPermukaan, volume1 );
  }
  static int hitungVolume (int sisi) {
   int volume = sisi*sisi*sisi;
   return volume;
  }
  static int hitungLuasPermukaan (int sisi) {
   int LuasP =  6*sisi*sisi;
   return LuasP;
  }
}
