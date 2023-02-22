import java.util.Scanner;
public class tugas7_4_Kiki {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int i,j,k,n;
     System.out.print("Masukkan Nilai N : ");
      n=sc.nextInt();

     if (n>=5){
       for (i=1; i<=n; i++) {
         if (i%2==0) {
           for (j=n; j>=1; j--) {
           System.out.print(j+ "");
           }
        }else {
           for (k=1; k<=n; k++) {
           System.out.print(k+ "");
           }
         }
          System.out.println();
         }
      }
      else {
        System.out.println("nilai yang anda masukkan kurang dari 5");
      }
    }
    
  }

