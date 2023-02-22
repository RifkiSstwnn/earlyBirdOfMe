import java.util.Scanner;
public class UTS_24_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String layanan24;
    int berat24, cuci24=3000, cucis24=5000, counter1=0, counter2=0;
    double harga24;
    char nama24,  ulang24='y';
    
    do {
      System.out.println("Masukkan  nama anda : ");
      nama24=sc.next().charAt(0);
      
      System.out.println("Masukkan berat pakaian anda : ");
      berat24=sc.nextInt();
      
      
     if (nama24=='s' || nama24=='S') {
      System.out.println("masukkan jenis layanan yang anda inginkan (1)mencuci / (2)mencuci dan menyetrika : ");
      layanan24=sc.next();
    
      if (layanan24.equalsIgnoreCase("mencuci")) {
        if (berat24<7) {
          harga24=berat24*cuci24;
          System.out.println("Total Anda membayar adlah : " +harga24);
          counter1++;
            
          if (berat24>7) {
            harga24= (double) berat24*cuci24-(berat24*cuci24*0.07);
            System.out.println("Total anda membayar adalah : " +harga24);
            counter1++;
          } else {
            System.out.println("Nilai yang anda masukkan salah");
            continue;
          }
        } else {
          System.out.println("Nilai yang anda masukkan salah");
          continue;
        }
      } else if (layanan24.equalsIgnoreCase("mencuci dan menyetrika")) {
          if (berat24<7) {
            harga24=berat24*cucis24;
            System.out.println("Total Anda membayar adlah : " +harga24);
            counter2++;
            
          } else if (berat24>7) {
            harga24= (double) berat24*cucis24-(berat24*cucis24*0.07);
            System.out.println("Total anda membayar adalah : " +harga24);
            counter2++;
          } else {
            System.out.println("Nilai yang anda masukkan salah");
            continue;
          }
      }
    } else {
      
      if (layanan24.equalsIgnoreCase("cuci") ) {

        harga24=berat24*cucis24;
        counter1++;
      } else if (layanan24.equalsIgnoreCase("mencuci dan menyetrika") ){

        harga24=berat24*cucis24;
        counter1++;
      } else {
        System.out.println("Nilai yang anda masukkan salah ");
        continue;
      }
        

      
      

    }
     System.out.println("Apakah anda mengisikan input nilai kembali ? (y/t)");
     ulang24=sc.next().charAt('y');

     

    
    

    
       
    } while (ulang24=='y'|| ulang24=='Y') ;
    
    System.out.println("Banyak layanan mencuci hari ini sebanyak :" +counter1);
    System.out.println("Banyak layanan susi dan setrika hari ini sebanyak : " +counter2);
    System.out.println("Pendapatan kotor hari ini adalah : " +harga24);
    System.out.println("Pendapatan bersih hari ini adalah : " +(harga24-35000));
    
  }
}    


