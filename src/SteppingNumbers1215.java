import java.util.ArrayList;
import java.util.List;

public class SteppingNumbers1215 {
    public List<Integer> countSteppingNumbers(int low, int high) {
        List<Integer> res = new ArrayList();
        for(int i = low; i <= high; i++){
            int temp = i;
            String str = String.valueOf(i);
            int count = 0;
            int prev = 0, current = 0;
            for(int j = 0; j < str.length(); j++){
                current = Integer.parseInt(String.valueOf(str.charAt(j)));
                if(j == 0){
                    count++;
                    prev = Integer.parseInt(String.valueOf(str.charAt(j)));
                    continue;
                }

                if(Math.abs(current - prev) == 1){
                    count++;
                    prev = current;
                }
            }
            if(count == str.length()){
                res.add(i);
            }
        }
        return res;
    }
}
