import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String S = "((()()()))()";
        int[] A = new int[]{-1, -10, -1, -1, -5, 4, 1, 2, 3, 200, 25};

        int result = solution.solution(S);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(String S) {
        if (S.length() % 2 != 0) {
            return 0;
        }
        int counter = 0;
        int x = 1;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
            }
        }
        if (counter == 0) {
            return 1;
        }
        return 0;
    }
}
