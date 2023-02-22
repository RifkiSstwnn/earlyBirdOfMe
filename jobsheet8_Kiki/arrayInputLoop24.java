import java.util.Scanner;
public class arrayInputLoop24 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int nilaiUAS [] = new int [6];

    for (int i=0; i<nilaiUAS.length; i++){
      System.out.println("Masukkan Nilai UAS ke " + i + ": ");
      nilaiUAS[i]=sc.nextInt(); 
     
    }
    for (int i=0; i<nilaiUAS.length; i++) {
      if (nilaiUAS[i]>70) {
      System.out.println("Nilai UAS ke " + i + " adalah " + nilaiUAS[i]);
      System.out.println("Mahasiswa Lulus");
     } else {
      System.out.println("Nilai UAS ke " + i + " adalah " + nilaiUAS[i]);
      System.out.println("Mahasiswa tidak lulus");
     }
    }  
  }
}
