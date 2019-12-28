import java.util.*;

public class ReorderDataLogFiles937 {

    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }

            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return logs;


//        Map<String, String> map = new HashMap<>();
//        Set<String> letterLog = new TreeSet<>();
//        Set<String> digitLog = new TreeSet<>();
//
//        for(String s: logs){
//            String id = s.split(" ")[0];
//            map.put(id, s);
//            if(s.charAt(0) == 'l'){
//                letterLog.add(id);
//            }else{
//                digitLog.add(id);
//            }
//        }
//
//        String[] out = new String[logs.length];
//        int count = 0;
//        for(String s: letterLog){
//            out[count++] = map.get(s);
//        }
//
//        for(String s: digitLog){
//            out[count++] = map.get(s);
//        }
//
//        return out;

    }
}
