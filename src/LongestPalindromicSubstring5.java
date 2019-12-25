public class LongestPalindromicSubstring5 {

    public String longestPalindromic(String s){
        int len = s.length();
        if(s==null || len < 2){
            return s;
        }

        boolean[][] isPali = new boolean[len][len];
        int left = 0, right = 0;// range to substring
        for(int j = 1; j < len; j++){
            for(int i = 0; i < j; i++){
                boolean isWordPali = isPali[i+1][j-1] || j-i <=2;
                if(s.charAt(i) == s.charAt(j) && isWordPali){
                    isPali[i][j] = true;

                    if(j-i > right-left){
                        left = i;
                        right = j;
                    }
                }
            }
        }
        return s.substring(left, right+1);
    }
}
