import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{-1, -10, -1, -1, -5, 4, 1, 2, 3, 200, 25};

        int result = solution.solution(A);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int[] A) {
        if (A.length > 100000 || A.length < 3) {
            return -1;
        }
        Arrays.sort(A);

        int x = A[0] * A[1] * A[A.length - 1];
        int y = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        return Math.max(x, y);
    }
}
