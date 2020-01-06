import java.util.*;

public class GroupAnagramsAlgo {
    public List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        Map<String, ArrayList<String>> map = new HashMap();
        List<List<String>> res = new ArrayList();
        Set<String> keys = new HashSet();
        for(String word : words){
            String key = sort(word);
            if(map.containsKey(key)){
                map.get(key).add(word);
            }else{
                ArrayList<String> strs = new ArrayList();
                strs.add(word);
                map.put(key, strs);
                keys.add(key);
            }
        }

        for(String key : keys){
            res.add(map.get(key));
        }
        return res;
    }

    private  String sort(String str){
        char[] cA = str.toCharArray();
        Arrays.sort(cA);
        return new String(cA);
    }
}
