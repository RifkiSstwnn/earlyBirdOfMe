package jobsheet12;

public class doubleLinkedListMain {
   public static void main(String[] args) throws Exception {
      doubleLinkedList dll=new doubleLinkedList();
      dll.print();
      System.out.println("Size : "+dll.size);
      System.out.println("----------------------------------------");
      dll.addFirst(3);
      dll.addLast(4);
      dll.addFirst(7);
      dll.print();
      System.out.println("Size : "+dll.size);
      System.out.println("----------------------------------------");
      dll.add(40, 1);
      dll.print();
      System.out.println("----------------------------------------");
      System.out.println("Data awal pada linked list adalah : "+dll.getFirst());
      System.out.println("Data akhir pada linked list adalah : "+dll.getLast());
      System.out.println("Data indeks ke-1 linked list adalah : "+dll.get(1));


dll.clear();
dll.print();
System.out.println("Size : "+dll.size);
dll.addLast(50);
dll.addLast(40);
dll.addLast(10);
dll.addLast(20);
dll.print();
System.out.println("----------------------------------------");
System.out.println("Size : "+dll.size);
dll.removeFirst();
dll.print();
System.out.println("----------------------------------------");
dll.removeLast();
dll.print();
System.out.println("Size : "+dll.size);
System.out.println("----------------------------------------");
dll.remove(1);
dll.print();
System.out.println("Size : "+dll.size);
dll.clear();
}
}
