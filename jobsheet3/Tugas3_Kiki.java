public class Tugas3_Kiki {
  public static void main(String[] args) {
    float suhu, celcius, reamur, fahrenheit, kelvin;
    suhu=30;
    celcius = suhu;
    reamur = celcius*4/5;
    fahrenheit =(celcius*5/6) + 32;
    kelvin=celcius+273;
    System.out.println("Tampilkan celcius\t\t : "+ celcius);
    System.out.println("Tampilkan reamur\t\t : "+ reamur);
    System.out.println("Tampilkan fahrenheit\t\t : "+ fahrenheit);
    System.out.println("Tampilkan kelvin\t\t : "+ kelvin);
  }
}
