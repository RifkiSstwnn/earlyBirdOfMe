package tugas12.Num1;

public class node {
   String data;
   node prev, next;
   int antrean;

   node(node prev, String data, int antrean,node next){
      this.prev=prev;
      this.data=data;
      this.antrean=antrean;
      this.next=next;

   }
   node(){

   }
   
}
