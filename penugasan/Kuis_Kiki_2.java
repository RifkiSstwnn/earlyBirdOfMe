public class Kuis_Kiki_2 {
  public static void main(String[] args) {
    int  terigu25=20, coklat25=100, chips25=50, beratb25, beratTotal25, t25, co25, ch25;
    beratb25=terigu25+coklat25+chips25;
    System.out.println("Untuk membuat 20 kue brownis maka ibu perlu 20 kali bahan tersebut, maka total bahan tersebut adalah :");
    beratTotal25=20*beratb25;
    System.out.println(+ beratTotal25);
    ch25=beratTotal25-(20*terigu25)-(20*coklat25);
    co25=beratTotal25-(20*terigu25)-(20*chips25);
    t25=beratTotal25-(20*chips25)-(20*coklat25);
    System.out.println("Jadi bahan yang diperlukan Ibu masing-masing adalah");
    System.out.println("chocochips\t :" +ch25);
    System.out.println("coklat\t\t :" +co25);
    System.out.println("Tepung terigu\t :" +t25);
  }
}
