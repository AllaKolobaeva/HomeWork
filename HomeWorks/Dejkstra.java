public class Dejkstra {
// кр путь

    public static int[] dijkstra(Graph G, int s) {
        final int[] dist = new int[G.size()];  // кратчайшее расстояние от s
        final int[] pred = new int[G.size()];  // предшествующий узел в пути
        final boolean[] visited = new boolean[G.size()]; // изначально всё фолс

        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;

        for (int i = 0; i < dist.length; i++) {
            final int next = minVertex(dist, visited);
            visited[next] = true;
// Самый короткий путь к следующему является dist[next] через pred[next].
            final int[] n = G.neighbors(next);
            for (int j = 0; j < n.length; j++) {
                final int v = n[j];
                final int d = dist[next] + G.getWeight(next, v);
                if (dist[v] > d) {
                    dist[v] = d;
                    pred[v] = next;
                }
            }
        }
        return pred;  // (не обращать внимания, если pred[s]==0!)
    }

    private static int minVertex(int[] dist, boolean[] v) {
        int x = Integer.MAX_VALUE;
        int y = -1;   // граф несвязный или не все вершины посещены
        for (int i = 0; i < dist.length; i++) {
            if (!v[i] && dist[i] < x) {
                y = i;
                x = dist[i];
            }
            return y;
        }
    

    public static void printPath(Graph G, int[] pred, int s, int e) {
        final java.util.ArrayList path = new java.util.ArrayList();
        int x = e;
        while (x != s) {
            path.add(0, G.getLabel(x));
            x = pred[x];
        }
        path.add(0, G.getLabel(s));
        System.out.println(path);
    }
}
public static void main(String[] args) {
        
    }
}