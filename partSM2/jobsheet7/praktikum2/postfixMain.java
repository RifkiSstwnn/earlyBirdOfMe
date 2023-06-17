package semester2.jobsheet7.praktikum2;

import java.util.Scanner;

public class postfixMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String p, q;
    System.out.println("Masukkan ekspresi matematika infix : ");
    q = sc.nextLine();
    q = q.trim();
    q = q + ")";
    int total = q.length();
    postfix post = new postfix(total);
    p = post.konversi(q);
    System.out.println("postfix: " + p);
    sc.close();
  }
}