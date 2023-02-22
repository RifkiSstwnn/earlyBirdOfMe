import java.util.Scanner;
public class tugas7_1_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i,j,k,n;
    System.out.print("Masukkan angka yang anda mau : ");
    n = sc.nextInt();

    if (n>=3) {
     for (i = 1; i<=n; i++) {
        for (j=n; j>=i; j--) {
         System.out.print(" ");
        }
        for (k=1; k<=i; k++) {
         System.out.print(k+ "");
        }
         System.out.println();
    
      }
    } else {
      System.out.println("Nilai Yang Anda Masukkan Kurang dari 3");
    }  
      
    
    
  }
}
