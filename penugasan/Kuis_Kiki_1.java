import java.util.Scanner;
public class Kuis_Kiki_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("------ Program Konversi Waktu ------");
    float t25,s25,h25;
    System.out.println("Masukkan Waktu:");
    t25=sc.nextFloat();
    s25=t25*60;
    h25=t25/60;
    System.out.print("Waktu " +t25 );
    System.out.print(" menit atau ");
    System.out.print(+s25 );
    System.out.print(" detik atau ");
    System.out.print(+h25);
    System.out.print(" jam");
    sc.close();

  }
  
}
