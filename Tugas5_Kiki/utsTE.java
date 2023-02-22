import java.util.Scanner;
public class utsTE {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sisi;
    double volume;
    System.out.println("Masukkan nilai panjang : ");
    sisi=sc.nextInt();
    volume= (double) 7.6625*sisi*sisi*sisi;
    System.out.println("Volume adalah : " +volume);

  }
}
