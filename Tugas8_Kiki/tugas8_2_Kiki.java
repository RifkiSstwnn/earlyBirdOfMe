import java.util.Scanner;
public class tugas8_2_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen : ");
    int elemen=sc.nextInt();
    int angka []=new int[elemen];

    for (int i=0; i<angka.length; i++) {
      System.out.print("Masukkan elemen array ke " + i + " : ");
      angka[i]=sc.nextInt();
    }
    int bil=angka[0];
    for (int i=0; i<angka.length; i++) {
      if (angka[i]>bil) {
        bil=angka[i];
      } 
      
    }
    System.out.print("Bilangan Terbesar : " +bil);

  }
}