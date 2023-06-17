package semester2.jobsheet7.praktikum1;

public class stack {
  int size, top;
  pakaian data[];

  public stack(int size) {
    this.size = size;
    data = new pakaian[size];
    top = -1;
  }

  public boolean IsEmpty() {
    if (top == -1) {
      return true;

    } else {
      return false;

    }
  }

  public boolean IsFull() {
    if (top == size - 1) {
      return true;
    } else {
      return false;
    }
  }

  public void push(pakaian pkn) {
    if (!IsFull()) {
      top++;
      data[top] = pkn;
    } else {
      System.out.println("Isi Stack Penuh");
    }
  }

  public void pop() {
    if (!IsEmpty()) {
      pakaian x = data[top];
      top--;
      System.out
          .println("Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
    } else {
      System.out.println("Stack Masih Kosong");
    }
  }


  public void peek() {
    System.out.println("Elemen teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " "
        + data[top].ukuran + " "
        + data[top].harga);
  }

  public void print() {
    System.out.println("Isi stack : ");
    for (int i = top; i >= 0; i--) {
      System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
          + data[i].harga);
    }
    System.out.println("");
  }
  

  public void getMin(){
    if(!IsEmpty()){
        for(int i=1; i<=top; i++){
          if(data[i].harga < data[0].harga){
            data[0] = data[i];
          }
        }
        System.out.println("Pakaian dengan harga terendah: " + data[0].jenis + " " + data[0].warna + " " + data[0].merk + " " + data[0].ukuran + " " + data[0].harga);
     }else {
      System.out.println("Stack masih kosong");
     }
  }

  public void clear() {
    if (!IsEmpty()) {
      for (int i = top; i >= 0; i++) {
        top--;
      }
      System.out.println("Stack sudah penuh");
    } else {
      System.out.println("Stack masih kosong");
    }
  }
}
