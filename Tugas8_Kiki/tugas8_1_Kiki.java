import java.util.Scanner;
public class tugas8_1_Kiki {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[]nomor=new int[5];
    for (int i = 0; i < 5; i++) {
      System.out.print("Masukkan nilai ke- "+i+" : ");
      nomor[i]=sc.nextInt();
    } 
    System.out.println("Setelah Dibalik");
    for (int i = 5-1; i >=0; i--) {
      System.out.print(nomor[i]);
    }
  }
}
