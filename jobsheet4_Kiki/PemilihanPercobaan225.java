import java.util.Scanner;
public class PemilihanPercobaan225 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int nilai1, nilai2, rata2 ;
    System.out.println("Masukkan Sebuah Bilangan : ");
    nilai1=sc.nextInt();
    System.out.println("Masukkan Sebuah Bilangan : ");
    nilai2=sc.nextInt();

    rata2=(nilai1+nilai2)/2;

    if(rata2>=100) {
      rata2-=5;
    }
    else{
      System.out.println("Hasil Nilai Akhir adalah " +rata2);
    }
    sc.close();
  }
}
