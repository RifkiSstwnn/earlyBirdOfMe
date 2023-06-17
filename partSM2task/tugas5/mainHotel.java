package semester2.tugas5;

public class mainHotel {
  public static void main(String[] args) {
    hotelService list = new hotelService();
    hotel1 h1 = new hotel1("Grand Yacht", "Jakarta", 6500000, 5);
    hotel1 h2 = new hotel1("Grand Victoria", "Jakarta", 1500000, 3);
    hotel1 h3 = new hotel1("Araya", "Jakarta", 2500000, 4);
    hotel1 h4 = new hotel1("Istana", "Jakarta", 750000, 2);
    hotel1 h5 = new hotel1("OYO", "Jakarta", 150000, 1);

    list.tambah(h1);
    list.tambah(h2);
    list.tambah(h3);
    list.tambah(h4);
    list.tambah(h5);

    System.out
        .println("Data bintang setelah diurutkan dari yang tertinggi ke yang terendah, menggunakan bubble sort :");
    list.bubbleSortt2r();
    list.tampil();

    System.out.println("Data harga setelah diurutkan dari yang terendah ke yang tertinggi, menggunakan bubble sort :");
    list.bubbleSortr2t();
    list.tampil();

    System.out
        .println("Data bintang setelah diurutkan dari yang tertinggi ke yang terendah, menggunakan selection sort :");
    list.selectionSortt2r();
    list.tampil();

    System.out
        .println("Data harga setelah diurutkan dari yang terendah ke yang tertinggi, menggunakan selection sort :");
    list.selectionSortr2t();
    list.tampil();
  }
}
