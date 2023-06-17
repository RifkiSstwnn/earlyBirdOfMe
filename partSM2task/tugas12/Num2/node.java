package tugas12.Num2;

public class node {
   String judul;
   node prev, next;
   int id;
   float rating;

   node(node prev, String judul, int id,float rating,node next){
      this.prev=prev;
      this.judul=judul;
      this.id=id;
      this.rating=rating;
      this.next=next;

   }
   node(){

   }
   
}
