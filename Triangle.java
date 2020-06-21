import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{5, 7, 1, 2, 6};

        int result = solution.solution(A);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int[] A) {
        if (A.length > 100000)
            return -1;
        if (A == null || A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {

            if (A[i] > 0 && (A[i] + A[i + 1] > A[i + 2])) {
                return 1;
            }
        }
        return 0;
    }
}
