package semester2.tugas4;

public class pemMayoritas {
  public int cariPemMayoritas(int[] panjang, int batas) {
    if (batas == 1) {
      return panjang[0];
    }
    int mid = batas / 2;
    int[] leftArr = jmlPanjang(panjang, 0, mid);
    int[] rightArr = jmlPanjang(panjang, mid, batas);
    int kiri = cariPemMayoritas(leftArr, mid);
    int kanan = cariPemMayoritas(rightArr, batas - mid);
    if (kiri == kanan) {
      return kiri;
    }
    int leftCount = hitung(panjang, batas, kiri);
    int rightCount = hitung(panjang, batas, kanan);
    if (leftCount > rightCount) {
      return kiri;
    } else {
      return kanan;
    }
  }

  public int[] jmlPanjang(int panjang[], int awal, int akhir) {
    int Arr[] = new int[akhir - awal];
    for (int i = awal; i < akhir; i++) {
      Arr[i - awal] = panjang[i];
    }
    return Arr;
  }

  public int hitung(int[] panjang, int batas, int x) {
    int counter = 0;
    for (int i = 0; i < batas; i++) {
      if (panjang[i] == x) {
        counter++;
      }
    }
    return counter;
  }

}
