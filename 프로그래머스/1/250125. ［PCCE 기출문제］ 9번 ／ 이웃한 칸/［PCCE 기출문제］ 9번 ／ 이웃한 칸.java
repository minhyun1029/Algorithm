class Solution {
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w];
        // (h+1,w) (h-1,w) (h,w+1) (h,w-1)
        int count =0;
        
        int[][] directions={{0,-1},{0,1},{1,0},{-1,0}};
        
        for(int[] dir:directions){
            
            int mov_h=h+dir[0];
            int mov_w=w+dir[1];
            
            if((mov_h>=0)&&(mov_h<board.length)&&(mov_w>=0)&&(mov_w<board[0].length)){
                if(color.equals((board[mov_h][mov_w]))){
                    count++;
                }
            }
        }
        return count;
    }
}