package semester2.jobsheet6;

import java.lang.annotation.Retention;

public class pencarianMhs {
  mahasiswa listMhs[];

  int idx;
  public int jumMhs;

  pencarianMhs(int jumMhs) {
    this.listMhs = new mahasiswa[jumMhs];
  }

  void tambah(mahasiswa m) {
    if (idx < listMhs.length) {
      listMhs[idx] = m;
      idx++;

    } else {
      System.out.println("Data Sudah Penuh");
    }
  }

  void tampil() {
    for (mahasiswa m : listMhs) {
      m.tampil();
      System.out.println("-----------------------------");
    }
  }

  public int findSeqSearch(int cari) {
    int posisi = -1;
    for (int j = 0; j < listMhs.length; j++) {
      if (listMhs[j].nim == cari) {
        posisi = j;
        break;
      }
    }
    return posisi;
  }

  public void tampilPosisi(int x, int pos) {
    if (pos != -1) {
      System.out.println("data : " + x + " ditemukan pada indeks " + pos);
    } else {
      System.out.println("data " + x + " tidak ditemukan");
    }
  }

  public void tampilData(int x, int pos) {
    if (pos != 1) {
      System.out.println("NIM\t : " + x);
      System.out.println("Nama\t : " + listMhs[pos].nama);
      System.out.println("Umur\t : " + listMhs[pos].umur);
      System.out.println("IPK\t : " + listMhs[pos].ipk);
    } else {
      System.out.println("data " + x + " tidak ditemukan");
    }
  }

  public int findBinarySarch(int cari, int left, int right) {
    int mid;
    if (right >= left) {
      mid = (left + right) / 2;
      if (cari == listMhs[mid].nim) {
        return (mid);
      } else if (listMhs[mid].nim > cari) {
        return findBinarySarch(cari, left, mid - 1);
      } else {
        return findBinarySarch(cari, mid + 1, right);
      }
    }
    return -1;
  }

  void selectionSort() {
    for (int i = 0; i < listMhs.length - 1; i++) {
      int idxMin = i;
      for (int j = i + 1; j < listMhs.length; j++) {
        if (listMhs[j].nim < listMhs[idxMin].nim) {
          idxMin = j;
        }
      }
      // swap
      mahasiswa tmp = listMhs[idxMin];
      listMhs[idxMin] = listMhs[i];
      listMhs[i] = tmp;
    }
  }
}
