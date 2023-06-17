package semester2.tugas3;

public class kerucut {
  public double r;
  public double sisiMiring;

  public double luasPermukaan1() {
    return 3.14 * r * r * sisiMiring;
  }

  public double volume1() {
    double tinggi = Math.sqrt(sisiMiring * sisiMiring - r * r);
    return r * r * tinggi * 3.14 * 1 / 3;
  }
}
