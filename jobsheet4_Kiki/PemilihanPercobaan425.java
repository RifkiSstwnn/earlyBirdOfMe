import java.util.Scanner;
public class PemilihanPercobaan425 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double angka1, angka2, Hasil;
    char operator;
    System.out.println("Masukkan Angka pertama : ");
    angka1=sc.nextDouble();
    System.out.println("Masukkan Angka kedua : ");
    angka2=sc.nextDouble();
    System.out.println("Masukkan Operator (+ - * /)  : ");
    operator=sc.next().charAt(0);
    
    switch (operator) {
      case '+':
      Hasil=angka1+angka2;
      System.out.println(angka1 + "+" + angka2 + "=" +Hasil);
        break;
      case '-':
      Hasil=angka1-angka2;
      System.out.println(angka1 + "-" + angka2 + "=" +Hasil);
        break;
      case '*' :
      Hasil=angka1*angka2;
      System.out.println(angka1 + "*" + angka2 + "=" +Hasil);
        break;
      case '/' :
      Hasil=angka1/angka2;
      System.out.println(angka1 + "/" + angka2 + "=" +Hasil);
        break;
      
      default:
      System.out.println("Operator yang Anda masukkan salah");
        break;
    }
    sc.close();
    
  }
}
