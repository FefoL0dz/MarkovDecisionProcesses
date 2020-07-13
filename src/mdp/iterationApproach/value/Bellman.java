package mdp.iterationApproach.value;
import java.util.*;
import java.util.Arrays;

/* This method was clonned from https://gist.github.com/nodirt/4b780f5d0bc4e0fe1b8b
    Variables methods were modified to fit our needs

In BellmanFord method you only iterate through the adjacent vertexes of
current vertex. However at each iteration you must iterate through all edges.
You need to add one for loop before for(DşrectedEdge e:g.adj())
that goes from 0 to V-1.In that case the running time will
become v^2+ve which can be also optimized by storing edges in a list etc.*
 */

public class Bellman{

        public static long dist[]; /* Calcula a distancia entre os estados */
        public static long prev[];
        public static LinkedList<arestaDirecionada> listaEstados= new LinkedList
                <arestaDirecionada>();

        public static class arestaDirecionada{
            protected int v;
            protected int w; // edge
            protected int weight; // weight;

            public arestaDirecionada(int v, int w, int weight){
                this.v = v;
                this.w = w;
                this.weight = weight;
            }

            public int from(){
                return v;
            }

            public int to(){
                return w;
            }

            public int weight(){
                return weight;
            }

            public String toString(){
                return v + "->" + w + " " + String.format("%d", weight);
            }

        }

        public static class WeightableDiGraph{
            protected int V; //vertex;
            protected int E; //edges;
            protected ArrayList<arestaDirecionada>[] adj;

            public WeightableDiGraph(int V){
                this.V = V;
                this.E = 0;
                adj = (ArrayList<arestaDirecionada>[]) new ArrayList[V];
                for (int v = 0; v < V; v++) {
                    adj[v] = new ArrayList<arestaDirecionada>();
                }

            }
            public int V(){
                return this.V;
            }

            public int E(){
                return this.E;
            }

            public void addEdge(int v, int w, int weight){
                this.E++;
                arestaDirecionada item = new arestaDirecionada(v, w, weight);
                adj[v].add(item);
                listaEstados.add(item);
            }

            public String toString() {
                StringBuilder s = new StringBuilder();
                String NEWLINE = System.getProperty("line.separator");
                s.append(V + " vertices, " + E + " edges " + NEWLINE);
                for (int v = 0; v < V; v++) {
                    s.append(String.format("%d: ", v));
                    for (arestaDirecionada e : adj[v]) {
                        s.append(e + "  ");
                    }
                    s.append(NEWLINE);
                }
                return s.toString();
            }
            public Iterable<arestaDirecionada> adj(int v) {
                if (v < 0 || v >= V) throw new IndexOutOfBoundsException();
                return this.adj[v];
            }

        }

        public static int BellmanFord(WeightableDiGraph g){
            Arrays.fill(dist, Long.MAX_VALUE);
            Arrays.fill(prev, -1);
            dist[0] = 0;
            for(int i = 1; i < g.V() - 1; i++){
                for(arestaDirecionada e : g.adj(i)){

                    if(dist[e.to()] > dist[e.from()] + e.weight()){
                        dist[e.to()] = dist[e.from()] + e.weight();
                        prev[e.to()] = e.to();
                    }
                }
            }

            for(int i = 0; i < g.V(); i++){
                for(arestaDirecionada e : g.adj(i)){
                    if(dist[e.to()] > dist[e.from()] + e.weight())
                        return 1;
                }
            }
            return 0;
        }

        public static void main(String args[]){
            int n, m, v, w, weight;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            m = sc.nextInt();
            dist = new long[n];
            prev = new long[n];
            WeightableDiGraph g = new WeightableDiGraph(n);
            for(int i = 0; i < m; i++){
                v = sc.nextInt();
                w = sc.nextInt();
                weight = sc.nextInt();
                g.addEdge(v - 1, w - 1, weight);
            }

                /**
                 *
                 * Sample Input:
                 * 4 4
                 * 1 2 1
                 * 4 1 2
                 * 2 3 2
                 * 3 1 -5
                 * Sample Output:
                 * 1
                 *
                 *
                 */

            System.out.println(BellmanFord(g));
        }
    }




