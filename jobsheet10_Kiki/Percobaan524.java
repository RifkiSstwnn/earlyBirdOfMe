package jobsheet10_Kiki;

public class Percobaan524 {
  static void tampil(String str, int... a) {
    System.out.println("strinng: " +str);
    System.out.println("Jumlah argumen/parameter: " +a.length);

    for (int i :  a) {
      System.out.println(i + "");
    }
    System.out.println( );
  }
  public static void main(String[] args) {
    tampil ("Daspro 2019", 100, 200);
    tampil ("Teknologi Inforamsi",1,2,3,4,5);
    tampil ("Polinema");
  }
  
}
