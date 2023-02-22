import java.util.Scanner;
import java.util.Random;
public class quiz {
  public static void main(String[] args) {
    Random random=new Random();
    Scanner sc=new Scanner(System.in);

    char menu='y';

    do {
      int number = random.nextInt(10) + 1;
      boolean succes= false;

      do{
        System.out.print("Tebak angka 1-10 : ");
        int answer=sc.nextInt();
        sc.nextLine();
        if (answer>number) {
          System.out.println("Jawaban anda lebih besar");
        } if (answer<number) {
          System.out.println("Jawaban anda lebih kecil");
        } if (answer==number) {
          System.out.println("selamat jawaban anda benar");
        }
        succes =(answer==number);
        
      } while (!succes);
      System.out.print("Apakah anda ingin mengulang permainan (y/Y) ?");
      menu=sc.next().charAt(0);
    } while(menu=='y'||menu=='Y');
    
    
  }
}
