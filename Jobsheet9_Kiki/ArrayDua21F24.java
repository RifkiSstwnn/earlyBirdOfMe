import java.util.Scanner;
public class ArrayDua21F24 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Masukkan Nilai baris : ");
    int baris1=sc.nextInt();
    System.out.print("Masukkan Nilai Kolom : ");
    int kolom1=sc.nextInt();

    String [] [] pengunjung= new String [baris1] [kolom1];

    for (int baris=0;baris<pengunjung.length;baris++) {
      for (int kolom=0;kolom<pengunjung[0].length;kolom++) {
        System.out.printf("Masukkan pengunjung ke [%s] [%s] : ", baris, kolom);
        pengunjung[baris][kolom] = sc.next();
        sc.nextLine();
      }
      System.out.println("----------------");

    }
    for (String array[] : pengunjung) {
      for (String ar : array) {
        System.out.printf("%s", ar);

      }
      System.out.println("");

    }

  }
}
