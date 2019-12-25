import java.util.Stack;

public class DecodeString394 {


    public String decodeString(String s) {
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {
                res += s.charAt(idx++);
            }
        }
        return res;
    }

//    public String decodeString(String s) {
//        int len = s.length();
//        if (len == 0) {
//            return null;
//        }
//        Stack<Integer> intStack = new Stack<>();
//        Stack<Character> charStack = new Stack<>();
//
//        int open = 0, index = 0;
//
//        StringBuilder res = new StringBuilder("");
//        StringBuilder temp = new StringBuilder("");
//        StringBuilder t = new StringBuilder("");
//
//        while(index < len){
//            int count = 0;
//            while(Character.isDigit(s.charAt(index))){
//                count = count * 10+ (s.charAt(index) - '0');
//                index++;
//            }
//            if(count > 0){
//                intStack.push(count);
//            }
//
//            if(s.charAt(index) == '['){
//                open++;
//                charStack.push(s.charAt(index));
//                index++;
//            }else if(s.charAt(index) == ']'){
//                open--;
//                String x;
//                while(charStack.peek() != '['){
//                    char out = charStack.pop();
//                    t.append(out);
//                }
//                x = t.reverse().toString();
//                t.setLength(0);
//                int repeat = intStack.pop();
//                for(int i = 0; i < repeat; i++){
//                    temp.append(x);
//                }
//                charStack.pop();// to remove '[' char
//                index++;
//                if(open == 0){
//                    res.append(temp.toString());
//                    temp.setLength(0);
//                }else{
//                    t.append(temp.toString());
//                    temp.setLength(0);
//                }
//            }else{
//                charStack.push(s.charAt(index));
//                index++;
//            }
//        }
//        while(charStack.size() > 0){
//            t.append(charStack.pop());
//        }
//        res.append(t.reverse().toString());
//        return res.toString();
//    }
//


}
