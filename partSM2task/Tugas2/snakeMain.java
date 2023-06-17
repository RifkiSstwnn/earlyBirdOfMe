package semester2.Tugas2;

import java.util.Scanner;

public class snakeMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char start;
    snake snakes = new snake();
    snakes.x = 11;
    snakes.y = 11;
    snakes.width = 21;
    snakes.height = 21;
    System.out.println("SELAMAT DATANG DI GAME ULAR\n--------------------------------------");
    System.out.println(
        "STORY :\n-----------------------------------\nSuatu ular terdampar pada suatu pulau yang dikelilingi tembok dengan koordinat x=21, dan y=21\nNamun Ular itu sedang kedinginan, dan ingin menggerakkan badannya supaya mendapat kehangatan.\nAyo gerrakan ular tersebut dan jangan mengenai tembok pulau.\nR=KANAN\nD=BAWAH\nL=KIRI\nR=KANAN");
    do {
      System.out.println("Ayo Jalankan Ularmu!!!");
      start = sc.next().charAt(0);
      if (start == 'U' || start == 'u') {
        snakes.moveUp();
      } else if (start == 'D' || start == 'd') {
        snakes.movDown();
      } else if (start == 'R' || start == 'r') {
        snakes.moveRight();
      } else if (start == 'L' || start == 'l') {
        snakes.moveLeft();
      }
    } while ((snakes.x >= 0 && snakes.x < 22 && snakes.y >= 0 && snakes.y < 22));
    sc.close();
  }
}
