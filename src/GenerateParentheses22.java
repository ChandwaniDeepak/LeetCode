import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }

    private void generate(List<String> result, String currentStr, int left, int right){
        if(0 > left || left > right){
            return;
        }

        if(left == 0 && right == 0){
            result.add(currentStr);
            return;
        }

        generate(result, currentStr + "(", left-1, right);
        generate(result, currentStr + ")", left, right-1);
    }
}
