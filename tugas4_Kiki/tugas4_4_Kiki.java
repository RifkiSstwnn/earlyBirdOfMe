import java.util.Scanner;
public class tugas4_4_Kiki {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int hbarangA, hbarangB, hbarangC, jbarangA, jbarangB, jbarangC, totalA, totalB, totalC;
    float diskon,totalBlnj, totBayar;
    System.out.println("Masukkan harga barang A : ");
    hbarangA=sc.nextInt();
    System.out.println("Masukkan jumlah barang A : ");
    jbarangA=sc.nextInt();
    System.out.println("Masukkan harga barang B : ");
    hbarangB=sc.nextInt();
    System.out.println("Masukkan jumlah barang B : ");
    jbarangB=sc.nextInt();
    System.out.println("Masukkan harga barang C : ");
    hbarangC=sc.nextInt();
    System.out.println("Masukkan jumlah barang C : ");
    jbarangC=sc.nextInt();

    totalA=hbarangA*jbarangA;
    totalB=hbarangB*jbarangB;
    totalC=hbarangC*jbarangC;
    totalBlnj=totalA+totalB+totalC;
    

    if (totalBlnj>200000) {
      diskon=totalBlnj*2/100;
    }
    else if (totalBlnj>500000) {
      diskon=totalBlnj*5/100;
    }
    else if (totalBlnj>1000000) {
      diskon=totalBlnj*10/100;
    }
    else {
      diskon=0;
    }
    totBayar=totalBlnj - diskon;

     System.out.println("------------------------------------");
     System.out.println("             Struk Nota"        );
     System.out.println("------------------------------------");
     System.out.println("Nama Barang | Harga | Jumlah | Total ");
     System.out.println(String.format("barang A     %s     %s      %s", hbarangA, jbarangA, totalA));
     System.out.println(String.format("barang B     %s     %s      %s", hbarangB, jbarangB, totalB));
     System.out.println(String.format("barang C     %s     %s      %s", hbarangC, jbarangC, totalC));
     System.out.println("Total Harga : " +totalBlnj);
     System.out.println("diskon      : " +diskon);
     System.out.println("total bayar : " +totBayar );
sc.close();
    
  }
}
