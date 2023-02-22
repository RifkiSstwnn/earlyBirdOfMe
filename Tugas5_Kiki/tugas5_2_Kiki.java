import java.util.Scanner;

public class tugas5_2_Kiki {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char pilih;
    byte menu;
    int sisi, alas, tinggi, jari2;
    double luas, volume;

    
      System.out.println("------------------------");
      System.out.println("Pilihlah Apa yang akan dicari : \n(1) Luas \t(2) Volume");
      System.out.println("Jawaban : ");
      menu = sc.nextByte();
      if (menu == 1) {
        System.out.println("------------------------");
        System.out.println("Pilihlah Apa yang akan dicari : \n(a) Persegi \t(b) Segitiga");
        System.out.println("Jawaban : ");
        pilih = sc.next().charAt(0);
        if (pilih == 'a') {
          System.out.println("------------------------");
          System.out.println("Masukkan nilai sisi : ");
          sisi = sc.nextInt();
          luas = (double) sisi * sisi;
          System.out.println("Hasil luas adalah : " + luas);
        } else if (pilih == 'b') {
          System.out.println("------------------------");
          System.out.println("Masukkan nilai alas : ");
          alas = sc.nextInt();
          System.out.println("Masukkan nilai tinggi : ");
          tinggi = sc.nextInt();
          luas = (double) (alas * tinggi) / 2;
          System.out.println("Hasil luas adalah : " + luas);
        } else {
          System.out.println("Nilai yang anda masukkan salah");
        }
      } else if (menu == 2) {
        System.out.println("------------------------");
        System.out.println("Pilihlah Apa yang akan dicari : \n(a) Kubus \t(b) Tabung");
        System.out.println("Jawaban : ");
        pilih = sc.next().charAt(0);
          if (pilih == 'a') {
            System.out.println("------------------------");
            System.out.println("Masukkan nilai sisi : ");
            sisi = sc.nextInt();
            volume = (double) sisi * sisi * sisi ;
            System.out.println("Hasil luas adalah : " + volume); 
          } else if (pilih == 'b') {
            System.out.println("------------------------");
            System.out.println("Masukkan nilai jari-jari : ");
            jari2 = sc.nextInt();
            System.out.println("Masukkan nilai tinggi : ");
            tinggi = sc.nextInt();
            volume = (double) 3.14 * jari2 * jari2 * tinggi;
            System.out.println("Hasil luas adalah : " + volume);
          } else {
            System.out.println("Nilai yang anda masukkan salah");
          }   
      } else {
        System.out.println("Nilai yang anda masukkan salah");
      }
      
      sc.close(); 
    }
    
  }

