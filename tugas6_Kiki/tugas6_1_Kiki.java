import java.util.Scanner;

public class tugas6_1_Kiki {
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int i, batas, NIM=3;
   System.out.println("Masukkan batas angka : ");
   batas=sc.nextInt();
   for(i=0;i<=batas;i++) {
    if(i%NIM==0) {
     continue; 
    }
    System.out.print(i+ " " );
  }
 }
}