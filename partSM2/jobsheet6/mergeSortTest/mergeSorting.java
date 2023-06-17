package semester2.jobsheet6.mergeSortTest;

import semester2.tugas3.data;

public class mergeSorting {
  mahasiswaMerge listMhs[] = new mahasiswaMerge[5];
  int idx = 0;

  void tambah(mahasiswaMerge m) {
    if (idx < listMhs.length) {
      listMhs[idx] = m;
      idx++;
    } else {
      System.out.println("Data Sudah Penuh");
    }
  }

  void tampil() {
    for (mahasiswaMerge m : listMhs) {
      m.tampil();
      System.out.println("-----------------------------");
    }
  }

  public void mergeSort() {
    sort(0, listMhs.length - 1);
  }

  private void merge(int left, int middle, int right) {
    int[] temp = new int[listMhs.length];
    for (int i = left; i <= right; i++) {
      temp[i] = listMhs[i].nim;
    }
    int a = left;
    int b = middle + 1;
    int c = left;

    while (a <= middle && b <= right) {
      if (temp[a] <= temp[b]) {
        listMhs[c].nim = temp[a];
        a++;
      } else {
        listMhs[c].nim = temp[b];
        b++;
      }
      c++;
    }
    int s = middle - a;
    for (int i = 0; i <= s; i++) {
      listMhs[c + i].nim = temp[a + i];
    }
  }

  private void sort(int left, int right) {

    if (left < right) {
      int middle = (left + right) / 2;
      sort(left, middle);
      sort(middle + 1, right);
      merge(left, middle, right);
    }

  }

  public void printArray() {
    int n = listMhs.length;
    for (int i = 0; i < n; i++) {
      System.out.print(listMhs[i] + " ");
    }
    System.out.println();
  }

  public int findSeqSearch(String cari) {
    int posisi = -1;
    int acuan = 0;
    for (int j = 0; j < listMhs.length; j++) {
      if (cari.equalsIgnoreCase(listMhs[j].nama)) {
        posisi = j;
        System.out.println("Data " + cari + " berada pada index " + posisi);
        tampilData(posisi);
        acuan += posisi;
        if (acuan > posisi - 1) {
          System.out.println("-------------------------------------");
          System.out.println("Data Yang Anda Masukkan Merupakan data Ganda!!!!!");
          System.out.println("-------------------------------------");
        }
      }
    }
    return posisi;
  }

  public int FindBinarySearch(int cari, int left, int right) {
    int[] arrNim = new int[listMhs.length];
    for (int i = 0; i < listMhs.length; i++) {
      arrNim[i] = listMhs[i].nim;
    }
    int mid;
    if (right >= left) {
      mid = (left + right) / 2;
      if (cari == arrNim[mid]) {
        return mid;
      } else if (arrNim[mid] > cari) {
        return FindBinarySearch(cari, left, mid - 1);
      } else {
        return FindBinarySearch(cari, mid + 1, right);
      }
    }
    return -1;
  }

  public void tampilData(int pos) {
    if (pos != 1) {
      System.out.println("NIM\t : " + listMhs[pos].nim);
      System.out.println("Nama\t : " + listMhs[pos].nama);
      System.out.println("Umur\t : " + listMhs[pos].angkatan);
      System.out.println("IPK\t : " + listMhs[pos].ipk);
    } else {
      System.out.println("data tidak ditemukan");
    }
  }

}
