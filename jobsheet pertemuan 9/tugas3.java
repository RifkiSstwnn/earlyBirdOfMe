import java.util.Scanner;

public class tugas3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Masukkan Nilai N =");
    int N = sc.nextInt();

    if (N>2){
      for (int i=0; i<= N; i++) {
        for (int j=0; j<= N; j++) {
          if (i==0 || i==N || j==0 || j==N) {
            System.out.println(N+" ");
          } else {
            System.out.print(" ");
          }
        } 
        System.out.println(" ");
      }
    }
    else {
      System.out.println("Nilai yang anda masukkan kurang dari 3");
    }

    
  }
  
}
