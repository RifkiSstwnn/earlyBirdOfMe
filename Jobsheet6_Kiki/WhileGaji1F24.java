import java.util.Scanner;
public class WhileGaji1F24 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int karyawan, jam, gaji, jumlah=0;
    String jabatan;

     System.out.println("Masukkan jumlah karyawan : ");
     karyawan = sc.nextInt();

     int i = 0;
     while (i<karyawan) {
      System.out.println("Pilihan jabatan - Direktur, Manager, Staf");
      System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
      jabatan =sc.next();
      System.out.print("Masukkan jumlah jam lembur : ");
      jam =sc.nextInt();
    
      if (jabatan.equalsIgnoreCase("direktur")) {
        continue;
      } else if (jabatan.equalsIgnoreCase("manager")) {
        gaji = jam * 100000;
      } else {
        gaji =jam * 75000;
      }
      i++;
      jumlah += gaji;
      System.out.println("Pengeluaran perusahaan = " + jumlah);
    } 
    sc.close();
    
    
    
  }
}
