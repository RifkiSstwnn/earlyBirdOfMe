package semester2.tugas5;

public class hotelService {
  hotel1 jumlahHotel[] = new hotel1[5];
  int idx;

  void tambah(hotel1 htl) {
    if (jumlahHotel.length > idx) {
      jumlahHotel[idx] = htl;
      idx++;
    }
  }

  void tampil() {
    for (hotel1 htl : jumlahHotel) {
      htl.tampil();
      System.out.println("----------------------------");
    }
  }

  void bubbleSortr2t() {
    for (int i = 0; i < jumlahHotel.length - 1; i++) {
      for (int j = 1; j < jumlahHotel.length - i; j++) {
        if (jumlahHotel[j].harga < jumlahHotel[j - 1].harga) {
          // dibawah ini mwrupakan proses penukaran
          hotel1 tmp = jumlahHotel[j];
          jumlahHotel[j] = jumlahHotel[j - 1];
          jumlahHotel[j - 1] = tmp;
        }
      }
    }
  }

  void bubbleSortt2r() {
    for (int i = 0; i < jumlahHotel.length - 1; i++) {
      for (int j = 1; j < jumlahHotel.length - i; j++) {
        if (jumlahHotel[j].bintang > jumlahHotel[j - 1].bintang) {
          // dibawah ini mwrupakan proses penukaran
          hotel1 tmp = jumlahHotel[j];
          jumlahHotel[j] = jumlahHotel[j - 1];
          jumlahHotel[j - 1] = tmp;
        }
      }
    }
  }

  void selectionSortt2r() {
    for (int i = 0; i < jumlahHotel.length - 1; i++) {
      int idxMin = i;
      for (int j = i + 1; j < jumlahHotel.length - i; j++) {
        if (jumlahHotel[j].bintang > jumlahHotel[idxMin].bintang) {
          idxMin = j;
        }
      }
      // swap
      hotel1 tmp = jumlahHotel[idxMin];
      jumlahHotel[idxMin] = jumlahHotel[i];
      jumlahHotel[i] = tmp;
    }
  }

  void selectionSortr2t() {
    for (int i = 0; i < jumlahHotel.length - 1; i++) {
      int idxMin = i;
      for (int j = i + 1; j < jumlahHotel.length - i; j++) {
        if (jumlahHotel[j].harga < jumlahHotel[idxMin].harga) {
          idxMin = j;
        }
      }
      // swap
      hotel1 tmp = jumlahHotel[idxMin];
      jumlahHotel[idxMin] = jumlahHotel[i];
      jumlahHotel[i] = tmp;
    }
  }

}
