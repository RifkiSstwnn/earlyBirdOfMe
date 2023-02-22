import java.util.Scanner;
public class DoWhileCuti1F24 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cuti=5;
    char konfirmasi;

    do {
      System.out.print("Apakah anda ingin menggunakan jatah cuti 1 hari (y/t) ?");
      konfirmasi=sc.next().charAt(0);
      if (konfirmasi=='y' || konfirmasi=='Y') {
        cuti--;
        System.out.printf("Sisa %d hari\n", cuti);
        if (cuti == 2) {
          System.out.println("STOP! Jatah cuti anda tinggal 2 hari");
          break;
        }
      } else {
        System.out.println("Ayo terus kerja untuk memperkaya bos anda");
        break;
      }
    } 
    while (cuti>0);
    sc.close();
  }
}
