import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> arr =new ArrayList<>();
        HashMap<String, Integer>map =new HashMap<>() {{
            put("code",0);
            put("date",1);
            put("maximum",2);
            put("remain",3);
        }};
        
        int remove = map.get(ext);
        int index = map.get(sort_by);
        
        for(int i=0;i<data.length;i++){
            if(data[i][remove]<val_ext){
                arr.add(data[i]);
            }
        }
        arr.sort(Comparator.comparing(x->x[index]));
        
        return arr.toArray(int[][]::new);
    }
}