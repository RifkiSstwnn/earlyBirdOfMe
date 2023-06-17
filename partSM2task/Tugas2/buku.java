package semester2.Tugas2;

public class buku {
  String nama, pengarang, penerbit;
  int hargaSatuan, jumlah;

  int hitungHargaTotal() {
    return hargaSatuan * jumlah;
  }

  int hitungDiskon(int n) {
    if (n >= 100000) {
      return (n = n * 1 / 10);
    } else if (n >= 50000 && n < 100000) {
      return (n = n * 5 / 100);
    } else {
      return 0;
    }
  }

  int hitungHargaBayar(int diskon, int all) {
    return all - diskon;
  }
}