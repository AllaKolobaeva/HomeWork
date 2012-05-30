import java.util.ArrayList;

public class Graf {
int V;
int E;
ArrayList adjList1;
Graf(int V){
this.V=V;
ArrayList adjList1[]=new ArrayList[V];
}
void addEdge(int V, int E){
this.E++;
this.V++;
}
}

public class DFS { 

    private boolean isEdge(int u, int v) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void runDFS(int v, VertexState[] state) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    enum VertexState {

        White, Gray, Black
    }

    public void DFS(int vertexCount) {
        VertexState state[] = new VertexState[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            state[i] = VertexState.White;
        }
        runDFS(0, state);
    }

    public void runDFS(int u, VertexState[] state, int vertexCount) {
        state[u] = VertexState.Gray;
        for (int v = 0; v < vertexCount; v++) {
            if (isEdge(u, v) && state[v] == VertexState.White) {
                runDFS(v, state);
            }
        }
        state[u] = VertexState.Black;
    }

    public class Grafvglubinu {
int N=10;
boolean [] visit=new boolean[N];
int [] [] G=new int[N][N];

private void dfs(int a) {
visit[a] = true;
for (int i = 0; i < N; i++){
if ((visit[i]==false) && G[a][i] == 1) {

visit[i] = true;
dfs(i);
}
}

}
}