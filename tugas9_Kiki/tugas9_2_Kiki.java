import javax.security.auth.callback.TextOutputCallback;

public class tugas9_2_Kiki {
  public static void main(String[] args) {
    String[] cabang = {"Dieng","Soehat","Sengkaling"};
    String[] jenisBuku = {"Novel","Komik","BukuPelajaran","Ensiklopedia"};
    int[][] jumlah ={{8,9,5,2},{7,5,10,3},{4,6,6,5}};
    int []harga = {40000,28000,60000,75000};
    int []jumlah1={0,0,0,0};
    int a=0;
    int max=0;
    int pendapatan [] = {0,0,0};
    String cabangmax= " ";
    
    System.out.println("--Penjualan buku di setiap cabang togamas--"); 
    for (int i=0; i<cabang.length; i++) {
      System.out.printf("%s)%s ",i+1,cabang[i]);
    }   
    for (int j=0; j<jumlah.length; j++) {
      int total=0;
      for (int k=0; k<jumlah[0].length; k++) {
        total+=jumlah[j][k];
        /*if (k==jumlah[0].length) {
          break;
        }*/
        
      }System.out.printf(" %s)%s ",j+1,total);
     
    }
    System.out.println(" ");
    System.out.println("--total jumlah penjualan--");
    for (int i=0; i<jenisBuku.length;i++) {
      int total=0;
      for (int j=0; j<jumlah.length;j++) {
        total+=jumlah[j][i];
        jumlah1[i]=total*harga[i];

      }
      a+=jumlah1[i];
      System.out.printf("penjualan %s adalah %s\n",jenisBuku[i], jumlah1[i]);
      
    }System.out.printf("totalnya %s", a);
    System.out.println(" ");
    
    for (int i=0;i<jumlah.length;i++){
      for (int j = 0,k = 0; j<jumlah[0].length && k<harga.length; j++, k++){
        pendapatan[i] += jumlah[i][j] * harga[k];
        if (max < pendapatan[i]){
            max = pendapatan[i];
            cabangmax = cabang[i];
        }
    }    
    }  System.out.printf("Pemasukan terbesar berasal dari cabang %s dengan jumlah %s", cabangmax,max);

    
    
  }
}
