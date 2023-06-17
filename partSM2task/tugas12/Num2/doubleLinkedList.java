package tugas12.Num2;


public class doubleLinkedList {
  node head;
  int size;

  public doubleLinkedList(){
   head=null;
   size=0;
   
  }

  public boolean isEmpty(){
   return head==null;
  }

  public void addFirst(String item, int antrean, float rating){
   if(isEmpty()){
      head=new node(null, item,antrean,rating, null);
   }else {
      node newNode=new node(null, item,antrean,rating, head);
      head.prev=newNode;
      head=newNode;
   }
   size++;
  }

  public void addLast(String item, int antrean,float rating){
   if(isEmpty()){
      addFirst(item,antrean,rating);
   } else{
      node current =head;
      while (current.next!=null){
         current = current.next;
      }
      node newNode=new node(current, item,antrean,rating, null);
      current.next=newNode;
      size++; 
   }
  }

  public void add(String item,int antrean,float rating, int index) throws Exception {
   if(isEmpty()){
      addFirst(item,antrean,rating);
   }else if (index<0||index>size) {
      throw new Exception("Nilai index di luar batas");
   }else {
      node current =head;
      int i=0;
      while (i<index){
         current=current.next;
         i++;
      }
      if(current.prev==null){
         node newnNode=new node(null, item,antrean,rating, current);
         current.prev=newnNode;
         head=newnNode; 
      }else {
         node newNode=new node(current.prev, item,antrean,rating, current);
         newNode.prev=current.prev;
         newNode.next=current;
         current.prev.next=newNode;
         current.prev=newNode;
      }
   }
   size++;
  }

  public int size(){
   return size;
  }

  public void clear(){
   head=null;
   size=0;
  }

  public void print(){
   if(!isEmpty()){
      node tmp=head;
      while (tmp!=null){
         System.out.println("ID : "+tmp.id+"\nJUDUL : "+tmp.judul+"\n RATING : "+tmp.rating);
         tmp=tmp.next;
      }
      System.out.println("\nBerhasil diisi");
   }else {
      System.out.println("Linked list masih Kosong");
   }
  }

  public void removeLast() throws Exception {
   if (isEmpty()){
      throw new Exception ("Linked list masih kosong, tidak dapat dihapus");
   }else if(head.next==null){
      head=null;
      size--;
      return;
   }
   node current=head;
   while (current.next.next!=null){
      current=current.next;
   }
   current.next=null;
   size--;
  }

  public void removeFirst() throws Exception {
    if (isEmpty()) {
       throw new Exception("Linked List masih kosong, tidak dapat dihapus"); 
      } else if (size == 1){
      removeLast(); 
      } else { 
      head = head.next; head.prev = null; size--;
      } 
   }

   public void remove(int index) throws Exception {
      if(isEmpty()||index>=size){
         throw new Exception("nilai index di luar batas");
      }else if(index==0){
         removeFirst();
      }else {
         node current = head;
         int i=0;
         while (i<index){
            current=current.next;
            i++;
         }
         if(current.next==null){
            current.prev.next=null;
         }else if(current.prev==null){
            current=current.next;
            current.prev=null;
            head=current;
         }else {
            current.prev.next=current.next;
            current.next.prev=current.prev;
         }
         size--;
      }
   }

   public String getLast() throws Exception {
      if(isEmpty()){
         throw new Exception("Linked List Kosong");
      }
      node tmp=head;
      while (tmp.next!=null){
         tmp=tmp.next;
      }
      return "ID : "+tmp.id+"\nJUDUL : "+tmp.judul+"\n RATING : "+tmp.rating; 
   }

   public String getFirst() throws Exception {
      if(isEmpty()){
         throw new Exception("Linked List Kosong");
      }
      return "ID : "+head.id+"\nJUDUL : "+head.judul+"\n RATING : "+head.rating;    
   }
   

   public String get(int index) throws Exception {
      if(isEmpty()||index>=size){
         throw new Exception("nilai index di luar batas");
      }
      node tmp=head;
      for (int i=0;i<index;i++){
         tmp=head.next;
      }
      return "ID : "+tmp.id+"\nJUDUL : "+tmp.judul+"\n RATING : "+tmp.rating; 
   }

   public void searcFilm(int id){
      node tmp=head;
      if (tmp.id==id){
         System.out.println("ID : "+tmp.id+"\nJUDUL : "+tmp.judul+"\n RATING : "+tmp.rating);
      } else {
         while(tmp.id!=id){
            tmp=tmp.next;
            if(tmp.id==id){
               System.out.println("ID : "+tmp.id+"\nJUDUL : "+tmp.judul+"\n RATING : "+tmp.rating);
            }
         }
      }
   }
   void bubbleSort() {
      if(head==null){
         return;
      }
      boolean swap;
      node curr;
      node temp;
      do{
         swap=false;
         curr=head;
         while(curr.next!=null){
            if(curr.rating<curr.next.rating){
               temp=curr.next;
               curr.next=temp.next;
               if(temp.next!=null){
                  temp.next.prev=curr;
               }
               temp.prev=curr.prev;
               if(curr.prev!=null){
                  curr.prev.next=temp;
               }else {
                  head=temp;
               }
               curr.prev=temp;
               temp.next=curr;
               swap=true;
            }else {
               curr=curr.next;
            }
         }
      }while(swap);
    }
} 


