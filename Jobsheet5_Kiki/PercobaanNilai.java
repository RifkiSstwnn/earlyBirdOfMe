import java.util.Scanner;
public class PercobaanNilai {
  public static void main(String[] args) {
      int nilai;
     // String grade;
      Scanner sc=new Scanner(System.in);
  
      System.out.println("inputkan nilai : ");
      nilai=sc.nextInt();
     
      if (nilai>=0&&nilai<=100) {
         if (nilai>=90&&nilai<=100) {
          System.out.println("Nilai A, EXCELLENT");
        } else if (nilai>=80&&nilai<=89) {
          System.out.println("Nilai B, tingkatkan prestasi anda");
        } else if (nilai>=60&&nilai<=79) {
          System.out.println("Nilai C, tingkatkan belajar anda");
        } else if (nilai>=50&&nilai<=59) {
          System.out.println("Nilai D, tingkatkan belajar anda");
  
        } else {
          System.out.println("Nilai E, anda tidak lulus");
        }
      } else if (nilai<0) {
        System.out.println("Nilai Yang anda masukkan kurang dari 0");
      } else if (nilai>100) {
        System.out.println("Nilai yang anda masukkan lebih dari 100");
      } else {
        System.out.println("Nilai yang anda masukkan tidak valid");
      }
      sc.close();
  }
}
