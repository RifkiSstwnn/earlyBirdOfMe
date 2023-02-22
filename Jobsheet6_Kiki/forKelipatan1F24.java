import java.util.Scanner;
public class forKelipatan1F24 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int kelipatan, jumlah=0, counter=0;
    float rata2;

    System.out.print("Masukkan bilangan kelipatan (1-9) : ");
    kelipatan = sc.nextInt();

    for (int i = 1; i<=50; i++) {
      if (i % kelipatan == 0) {  
          counter++; {
          jumlah+=i;    
        }
      } 
        
    }
      
    
    rata2=(float) jumlah/counter;
      System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
      System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah); 
      System.out.println("Rata-rata dari data tersebut adalah : " +rata2);
    sc.close();
  }
}
