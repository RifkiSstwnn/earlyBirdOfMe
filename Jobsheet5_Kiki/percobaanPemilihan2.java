import java.util.Scanner;
public class percobaanPemilihan2 {
 
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String kategori;
      int penghasilan, gajiBersih;
      double pajak=0;
  
      System.out.println("Masukkan Kategori : ");
      kategori=sc.nextLine();
      System.out.println("Masukkan besarnya penghasilan : ");
      penghasilan=sc.nextInt();
  
      if (kategori.equalsIgnoreCase("pekerja keras")) {
        if (penghasilan<=0) {
          System.out.println("Penghasilan yang dimasukkan tidak valid");
        } else if  (penghasilan<= 2500000) {
          pajak=0.1;
        } else if (penghasilan <= 3000000) {
          pajak=0.15;
        } else {
          pajak = 0.2;
        }
        gajiBersih=(int) (penghasilan-(penghasilan*pajak));
        System.out.println("Gaji bersih yang anda terima : " +gajiBersih);
      } else if (kategori.equalsIgnoreCase("Pebisnis")) {
        if (penghasilan<=0) {
          System.out.println("Penghasilan yang dimasukkan tidak valid");
        } else if (penghasilan <= 2500000) {
          pajak=0.15;
        } else if (penghasilan <= 300000) {
          pajak=0.2;
        } else {
          pajak=0.25;
        }
        gajiBersih= (int) (penghasilan-(penghasilan*pajak));
        System.out.println("Gaji bersih yang anda terima : " +gajiBersih);
      } else {
        System.out.println("Kategori yang anda masukkan salah");
      } 
      sc.close();
  }
}
