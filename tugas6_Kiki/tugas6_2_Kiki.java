public class tugas6_2_Kiki {
  public static void main(String[] args) {
    int tanggal, hargaAnak = 50000, hargaDewasa = 100000, jumlah, total, counter = -1;
    jumlah = (5 * hargaAnak) + (5 * hargaDewasa);
    System.out.println(
        "--------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Tanggal\t\t\tharga tiket anak\t\tbanyak\t\tharga tiket dewas\tbanyak\t\tJumlah");
    for (tanggal = 0; tanggal <= 31; tanggal++) {
      counter++;
      if (tanggal % 7 == 0) {
        continue;
      } else {
        System.out.printf("%d Agustus 2022\t\t%d\t\t\t\t5\t\t %d\t\t\t5\t\t%d\n", tanggal, hargaAnak, hargaDewasa,
            jumlah);
      }
    }
    System.out.println(
        "--------------------------------------------------------------------------------------------------------------------------");
    total = (counter - 4) * jumlah;
    System.out.printf("Total pendapatan per-31 Agustus 2022  : \t\t\t\t\t\t\t\t\t%d\n", total);

  }
}
