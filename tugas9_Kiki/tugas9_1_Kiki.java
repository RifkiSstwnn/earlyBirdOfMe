public class tugas9_1_Kiki {
  public static void main(String[] args) {
   char karakter[]={'R','i','f','k','i','S','e','t','i','a','w','a','n'};
   char [][] tabel = new char[8][5];

   int a=0;
   for (int i=0;i<8;i++) {
    for (int j=0;j<5;j++) { 
      tabel[i][j] = karakter[a];
      a++;
      if (a==13) {
       a=0;
      } 
      System.out.print(tabel [i][j] + " ");
    }
    System.out.println(" ");
   }
  }
}
