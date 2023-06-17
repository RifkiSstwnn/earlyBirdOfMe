package semester2.jobsheet8.praktikum1;

public class queue {
  int data[];
  int front, rear, size, max;

  public queue(int n) {
    max = n;
    data = new int[max];
    size = 0;
    front = rear = -1;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isFull() {
    if (size == max) {
      return true;
    } else {
      return false;
    }
  }

  public void peek() {
    if (!isEmpty()) {
      System.out.println("Elemen terdepan : " + data[front]);
    } else {
      System.out.println("Queue masih kosong");
    }
  }

  public void print() {
    if (isEmpty()) {
      System.out.println("Queue masih kosong");
      System.exit(0);
    } else {
      int i = front;
      while (i != rear) {
        System.out.print(data[i] + " ");
        i = (i + 1) % max;
      }
      System.out.println(data[i] + " ");
      System.out.println("Jumlah elemen =" + size);
    }
  }

  public void clear() {
    if (!isEmpty()) {
      front = rear = -1;
      size = 0;
      System.out.println("Queue berhasil di kosongkan.");
    } else {
      System.out.println("Queue masih kosong");
    }
  }

  public void enqueue(int dt) {
    if (isFull()) {
      System.out.println("Queue Sudah Penuh");
      System.exit(0);
    } else {
      if (isEmpty()) {
        front = rear = 0;
      } else {
        if (rear == max - 1) {
          rear = 0;
        } else {
          rear++;
        }
      }
      data[rear] = dt;
      size++;
    }
  }

  public int dequeue() {
    int dt = 0;
    if (isEmpty()) {
      System.out.println("Queue masih kosong");
    } else {
      dt = data[front];
      size--;
      if (isEmpty()) {
        front = rear = -1;
      } else {
        if (isEmpty()) {
          front = rear = -1;
        } else {
          front++;
        }
      }
    }
    return dt;
  }
}
