import java.util.Scanner;
public class tugas4_1_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int bilanganBulat1, bilanganBulat2;
    System.out.println("Masukkan Bilangan Bulat 1 : ");
    bilanganBulat1=sc.nextInt();
    System.out.println("Masukkan Bilangan Bulat 2 : ");
    bilanganBulat2=sc.nextInt();

    if (bilanganBulat1>bilanganBulat2) {
      System.out.println("Bilangan Bulat yang terbesar adalah "+bilanganBulat1);
    }
    else {
      System.out.println("Bilangan Bulat yang terbesar adalah "+bilanganBulat2);
    }
    sc.close();
  }
}
