package jobsheet10_Kiki;

public class Greeting24 {
  public static void main(String[] args) {
    beriSalam();
    String salam="Selamat datang di pemrograman java";
    beriUcapan(salam);
    System.out.println("Halo Selamat Pagi");
  }
  static void beriSalam() {
    System.out.println("Halo! Selamat pagi");
  }
  static void beriUcapan (String ucapan){
    System.out.println(ucapan);
  }
}
