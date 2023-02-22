import java.util.Scanner;
public class PemilihanPercobaan125 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int bil;
      System.out.println("Masukkan Sebuah Bilangan : ");
      bil=sc.nextInt();
      String output=(bil%2==0)?"Bilangan Genap":"Bilangan Ganjil";

      System.out.println(output);
      sc.close();
  }
}
