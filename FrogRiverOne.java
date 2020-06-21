import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4, 2};
        int X = 5;
        int result;
        Solution solution = new Solution();
        result = solution.solution(X, A);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int X, int[] A) {

        Set currentLeavesSet = new HashSet();

        for (int p = 0; p < A.length; p++) {
            currentLeavesSet.add(A[p]);
            if (currentLeavesSet.size() < X) continue;
            else
                return p;
        }
        return -1;
    }
}
