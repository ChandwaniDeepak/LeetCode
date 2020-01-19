public class MultiplyStrings43 {

    public String multiply(String num1, String num2) {

        if(num1 == null || num1.length() == 0 ||num2 == null ||
                num2.length() == 0){
            return "";
        }

        char[] char1 = num1.toCharArray();
        char[] char2 = num2.toCharArray();
        int carry = 0;

        int[] res = new int[num1.length() + num2.length()];
        for(int i = char1.length - 1; i >= 0; i--){
            int a = (int) char1[i] - '0';
            for(int j = char2.length - 1; j >= 0; j--){
                int index = i+j+1;
                int b = (int) char2[j] - '0';
                res[index] = (res[index] + (a*b))%10;
                res[index - 1] = (res[index - 1]+(a*b)) / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i: res){
            if(sb.length() == 0 && i == 0){
                continue;
            }
            sb.append(String.valueOf(i));
        }

        return sb.toString();
    }
}
