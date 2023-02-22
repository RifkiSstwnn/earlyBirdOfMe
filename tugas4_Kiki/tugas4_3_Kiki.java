import java.util.Scanner;
public class tugas4_3_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double uas, uts, kuis, tugas, nilaiAkhir;
    System.out.println("Masukkan Nilai Tugas : ");
    tugas=sc.nextFloat();
    System.out.println("Masukkan Nilai kuis : ");
    kuis=sc.nextFloat();
    System.out.println("Masukkan Nilai UTS : ");
    uts=sc.nextFloat();
    System.out.println("Masukkan Nilai UAS : ");
    uas=sc.nextFloat();

    nilaiAkhir=(0.2*tugas)+(0.1*kuis)+(0.3*uts)+(0.4*uas);

    if (nilaiAkhir>65) {
      System.out.println("Selamat nilai anda baik dengan total : " +nilaiAkhir);
    }
    else{
      System.out.println("Mohon maaf anda harus mengikuti remidi dengan nilai : " +nilaiAkhir);
    }
  sc.close();
    
    
  }
}
