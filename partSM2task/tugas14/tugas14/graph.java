package tugas14;
import java.util.Scanner;
public class graph {
    int vertex;
    linkedList list [];
    node right;
    
    public graph(int vertex) {
        this.vertex = vertex;
        list = new linkedList[vertex];
        for (int i = 0 ; i < vertex ; i++) {
            list[i] = new linkedList();
        }
    }
    public void addEdge (int source, int destination, int graphType) {
        //add edge
        if(graphType(graphType)==true){
          list[source].addFirst(destination);
        }else{
        //add back edge(for undirected)
        list[source].addFirst(destination);
        list[destination].addFirst(source);
        } 
    }
    public static boolean graphType(int graphType){
        if(graphType==1){
            return true;
        }else {
            return false;
        }   
    }
    public void degree (int source) throws Exception{
        //degree undirected graph
        System.out.println("Degree vertex " + source + " : " + list[source].size());
        //degree directed graph
        // inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex ; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
        
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }
    //menghapus keterhubungan atau edge
    public void removeEdge(int source, int destination) throws Exception {
        int i = 0;
        node tmp = list[source].head;
        while (tmp.data != destination) {
            tmp = tmp.next;
            i++;
        }
        list[source].remove(i);
    }
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("vertex " + i + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                } System.out.println("");
            }
        }System.out.println(" ");

    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan jumlah Vertex : ");
        int vertex=sc.nextInt();
        System.out.println("Masukkan Jumlah Edge : ");
        int edge=sc.nextInt();
        //memilih tipe graph
        System.out.print("gunakan graph type \n 1.directed\n 2.undirected \n(pilih 1/2): ");
        int graphtype = sc.nextInt();
        graph graph=new graph(vertex);
        //penambahan Menu soal nomor 1
        int menu;
        do{
          menu();
          System.out.print("Masukkan Input : ");
          menu=sc.nextInt();
          if(menu==1){
            for (int i = 0; i < edge; i++) {
                System.out.println("Add Edge " + (i + 1));
                System.out.print("Tambahkan source edge : ");
                int source = sc.nextInt();
                System.out.print("Tambahkan destination edge : ");
                int destination = sc.nextInt();
                graph.addEdge(source, destination, graphtype);
            }
          }else if(menu==2){
            System.out.print("Masukkan vertex source : ");
            int VerSourc = sc.nextInt();
            graph.degree(VerSourc);
          }else if(menu==3){
            System.out.print("Masukkan source edge yang akan dihapus : ");
            int sRemove = sc.nextInt();
            System.out.print("Masukkan destination edge yang akan dihapus : ");
            int dRemove = sc.nextInt();
            graph.removeEdge(sRemove, dRemove);
          }else if(menu==4){
            graph.removeAllEdges();
            System.out.println("Seluruh edge telah dihapus");
          }else if(menu==5){
            graph.printGraph();
          }

        }while(menu==1||menu==2||menu==3||menu==4||menu==5);
        

        
        
    }
    public static void menu() {
        System.out.println(" ----------program-----------");
        System.out.println(" 1. Tambahkan Edge          ");
        System.out.println(" 2. Tampil derajat lintasan ");
        System.out.println(" 3. Hapus edge tertentu     ");
        System.out.println(" 4. Hapus semua edge        ");
        System.out.println(" 5. Print Graph             ");
        System.out.println(" 6. Keluar                  ");
    }
}