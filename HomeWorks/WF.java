public class WagnerFisher {


  public int WF (String s1, String s2) {
  int d[][];
  int n = s1.length(); 
  int m =s2.length();
  int cost = 0;
  int i;
  int j;
  d = new int[n][m];

    for (i = 0; i <= n; i++) {
      d[i][0] = i;
    }
    for (j = 0; j <= m; j++) {
      d[0][j] = j;
    }
    for (i = 1; i <= n; i++) {
         for (j = 1; j <= m; j++) {
             if (s1== s2) {
          cost = 0;
        }
        else {
          cost = 1;
        }
      }
    }
    int a = d[i-1][j]+1;
    int b = d[i][j-1]+1;
    int c = d[i-1][j-1] + cost;
    
d[i][j] = Math.min(d[i-1][j]+1, d[i][j-1]+1);
d[i][j]= Math.min(d[i-1][j-1] + cost, d[i][j]);
return d[n][m];

  }


public static void main (String[] args){
    
}

}