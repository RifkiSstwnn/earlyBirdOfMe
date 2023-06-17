package semester2.jobsheet6.mergeSortTest;

public class mahasiswaMerge {
  String nama;
  int angkatan, nim;
  double ipk;

  mahasiswaMerge(String nama, int nim, double ipk, int angkatan) {
    this.nama = nama;
    this.nim = nim;
    this.ipk = ipk;
    this.angkatan = angkatan;

  }

  void tampil() {
    System.out.println("NIM = " + nim);
    System.out.println("Nama = " + nama);
    System.out.println("Angkatan = " + angkatan);
    System.out.println("IPK = " + ipk);
  }
}
