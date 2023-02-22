import java.util.Scanner;
public class tugas4_2_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int umur;
    System.out.println("Masukkan Umur : ");
    umur=sc.nextInt();
    if (umur>=17) {
      System.out.println("Boleh Berkendara");
    }
    else{
      System.out.println("Tidak boleh berkendara");
    }
    sc.close();
  }
}
