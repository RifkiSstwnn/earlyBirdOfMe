package semester2.tugas3;

public class limasS4 {
  public double panjangSisi;
  public double tinggiAlas;

  public double luasPermukaan2() {
    double miring = Math.sqrt(tinggiAlas * tinggiAlas + (panjangSisi * panjangSisi * 1 / 4));
    return (panjangSisi * panjangSisi) + (4 * 1 / 2 * panjangSisi * miring);
  }

  public double volume2() {
    return (1 - 2 / 3) * panjangSisi * panjangSisi * tinggiAlas;
  }
}
