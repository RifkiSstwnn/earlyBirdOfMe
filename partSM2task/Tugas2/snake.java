package semester2.Tugas2;

public class snake {
  int x, y, width, height;

  void moveLeft() {
    x -= 1;
    if (x < 0) {
      detectCollision();
    } else if (x == 1) {
      System.out.println("Anda mendekati batas");
    }
  }

  void moveRight() {
    x += 1;
    if (x > width) {
      detectCollision();
    } else if (x == 20) {
      System.out.println("Anda mendekati batas");
    }
  }

  void moveUp() {
    y += 1;
    if (y > height) {
      detectCollision();
    } else if (y == 20) {
      System.out.println("Anda mendekati batas");
    }
  }

  void movDown() {
    y -= 1;
    if (y < 0) {
      detectCollision();
    } else if (y == 1) {
      System.out.println("Anda mendekati batas");
    }
  }

  void printPosition() {
    System.out.println("koordinat x : " + x);
    System.out.println("koordinat y : " + y);
  }

  void detectCollision() {
    System.out.println("Game Over\nUlarmu menabrak pembatas");
    printPosition();

  }
}
