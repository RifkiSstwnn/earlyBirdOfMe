import java.util.Scanner;
public class tugas8_3_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen : ");
    int elemen=sc.nextInt();
    int angka []=new int[elemen];

    for (int i=0; i<angka.length; i++) {
      System.out.print("Masukkan elemen array ke " + (i+1) + " : ");
      angka[i]=sc.nextInt();
    } 
    for (int j=0; j<angka.length; j++) {
      if (angka[j]%2==0) {
        System.out.println("Angka genap : " + angka[j]);
      } else {
        System.out.println("Angka gamjil : " + angka[j]);
      }
    }
  }
}
