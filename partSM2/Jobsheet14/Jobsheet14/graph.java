package Jobsheet14;

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
    public void addEdge (int source, int destination) {
        //add edge
        list[source].addFirst(destination);
        //add back edge(for undirected)
        list[destination].addFirst(source);
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
    
    public void removeEdge1(int source, int destination) throws Exception {
        int i=0;
        node temp=list[source].head;
        while (temp.data != destination) {
            temp = temp.next;
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
        graph graph = new graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);

        
        graph.removeEdge1(1, 3);

        graph.printGraph();
    }
}