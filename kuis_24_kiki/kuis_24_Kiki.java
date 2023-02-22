public class kuis_24_Kiki {
  public static void main(String[] args) {
    int jmlMakanan24 [][]={{6,8,4},
    {10,16,11},
    {9,14,10},
    {12,5,7},
    {5,8,5}};
    String[] nama={"italianfood","Korean food","Chinese food","Khas Jogja","Khas Madura"};
    int max=0, min=100;
    int total=0, jumlah=0, hasil=0;
    String pmax="",pmin="";

    System.out.println("Jumlah Makanan : ");
    System.out.println(" ");
    for (int i=0,h=0;i<jmlMakanan24.length&&h<nama.length;i++,h++){
      int total24=0;
      for (int j=0;j<jmlMakanan24[0].length;j++) {
        total24+=jmlMakanan24[i][j];
      }
      System.out.print(nama[i]);
      System.out.printf(" %s ", total24);
      System.out.println(" ");
    } 
    System.out.print("rata-rata pembelian makanan khas madura : ");
    for (int i=0;i<jmlMakanan24.length;i++){
      for (int j=0;j<jmlMakanan24[0].length;j++) {
        if (i==4) {
          jumlah+=jmlMakanan24[i][j];
          hasil=jumlah/3;
        }                 
      }      
    } System.out.print(hasil);
    System.out.println(" ");
    for (int i = 0; i < jmlMakanan24.length; i++) {
        for (int j = 0; j < jmlMakanan24[0].length; j++) {
          if (max<jmlMakanan24[i][2]) {
            max=jmlMakanan24[i][2]; 
            pmax=nama[i];
          }if (min>jmlMakanan24[i][2]) {
            min=jmlMakanan24[i][2]; 
            pmin=nama[i];
          } 
       }
     } System.out.printf("Makanan Terlaris adalah %s, sedangkan yang paling tidak laku adalah %s ", pmax, pmin);
     System.out.println(" ");
     for (int i=0;i<jmlMakanan24.length;i++) {
      for (int j=0;j<jmlMakanan24[0].length;j++) {
      if (i<3) {
        total+=jmlMakanan24[i][j]*50000;
      } else {
        total+=jmlMakanan24[i][j]*35000;
      }
      }
    }
    System.out.println("total pendapatan " +total); 
   }
}
