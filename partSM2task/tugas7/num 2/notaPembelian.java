public class notaPembelian {
  String noTransaksi;
  double hargaTotal;
  int tanggalPembelian, jumlahTotal;

  notaPembelian(String noTransaksi, int tanggalPembelian, int jumlahTotal, double hargaTotal) {
    this.noTransaksi = noTransaksi;
    this.tanggalPembelian = tanggalPembelian;
    this.jumlahTotal = jumlahTotal;
    this.hargaTotal = hargaTotal;
  }
}
