import java.util.Arrays;

class Solution {
  public int solution(int[][] info, int n, int m) {
      int numItems = info.length;

      int[][][] dp = new int [numItems+1][n][m];

      for(int i=0;i<=numItems;i++){
        for(int a=0;a<n;a++){
          Arrays.fill(dp[i][a], Integer.MAX_VALUE);
        }
      }
      dp[0][0][0]=0;

      for(int i=0;i<numItems;i++){
        int aTrace = info[i][0];
        int bTrace = info[i][1];

        for(int a=0;a<n;a++){
          for(int b=0;b<m;b++){
            if(dp[i][a][b]==Integer.MAX_VALUE)continue;

            int newA = a+ aTrace;
            if(newA<n){
              dp[i+1][newA][b]=Math.min(dp[1+i][newA][b],dp[i][a][b]+aTrace);
            }

            int newB = b+bTrace;
            if(newB<m){
              dp[i+1][a][newB] = Math.min(dp[i+1][a][newB], dp[i][a][b]);
            }
          }
        }
        
      }
      int minATrace = Integer.MAX_VALUE;
      for(int a=0;a<n;a++){
        for(int b=0;b<m;b++){
          if(dp[numItems][a][b]<minATrace){
            minATrace = dp[numItems][a][b];
          }
        }
      }
      return minATrace == Integer.MAX_VALUE ? -1:minATrace;
  }
}