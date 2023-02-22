import java.util.Scanner;
public class tutordek {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float tinggi,berat,rata;
    System.out.println("masukkan tinggi :");
    tinggi=sc.nextFloat();
    System.out.println("masukkan berat :");
    berat=sc.nextFloat();
    rata=tinggi/berat;
    System.out.println("jika " + rata + "hasil rata jika siswa menghitung rata-rata" +rata );
    sc.close();


  
  }
}
