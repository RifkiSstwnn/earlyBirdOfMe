import java.util.Scanner;

public class tugas5_1_Kiki {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String kode, jawab;
    int biayapg = 1250000, biayasg = 1375000, biayamg = 2500000, adm = 50000, biayareg, total;

    System.out.println("Apakah anda ingin melakukan perjalanan ? ya/tidak");
    jawab = sc.nextLine();

    if (jawab.equalsIgnoreCase("ya")) {
      System.out.print("Masukkan Kode Keberangkatan [pg/sg/mg/reg] : ");
      kode = sc.nextLine();
      System.out.println("Kode keberangkatan : " + kode);
      if (kode.equalsIgnoreCase("pg")) {
        System.out.println("Kelas kereta : eksekutif");
        System.out.println("Biaya Tiket : " + biayapg);
        total = biayapg + adm;
        System.out.println("Total Bayar : " + total);
      } 
        if (kode.equalsIgnoreCase("sg")) {
          System.out.println("Kelas kereta : bisnis");
          System.out.println("Biaya Tiket : " + biayasg);
          total = biayasg + adm;
          System.out.println("Total Bayar : " + total);
        }
          if (kode.equalsIgnoreCase("mg")) {
            System.out.println("Kelas kereta : premium");
            System.out.println("Biaya Tiket : " + biayapg);
            total = biayapg + adm;
            System.out.println("Total Bayar : " + total);
          } 
            if (kode.equalsIgnoreCase("reg")) {
              System.out.println("Kelas kereta : regular");
              System.out.println("Biaya Tiket : " + adm);
              System.out.println("Total Bayar : " + adm);
            }  
    } else {
      System.out.println("Silahkan kunjungi kami lain kali");
    }

    sc.close();
  }

}
