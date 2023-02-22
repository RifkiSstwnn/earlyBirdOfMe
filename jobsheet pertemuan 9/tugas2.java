import java.util.Scanner;
public class tugas2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Masukkan Nilai N : ");
    int N = sc.nextInt();

    if (N>=5) {
      for (int i=0; i<=N; i++ ) {
        System.out.print("*");
      }
      System.out.println();
    }
    else {
      System.out.println("Nilai yang anda masukkan salah kuang dari 5");
    }
  }
}
