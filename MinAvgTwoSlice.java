import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{4, 2, 2, 5, 1, 1, 5, 2, 1};


        int result = solution.solution(A);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int[] A) {
        double avarage = (double) (A[A.length - 1] + A[A.length - 2]) / 2;
        double mid = 0;
        int position = A.length;

        if (A.length < 2 || A.length > 100000 || A[A.length - 1] > 10000 || A[A.length - 1] < -10000) {
            return -1;

        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < -10000 || A[i] > 10000) {
                return -1;
            }
            mid = (double) (A[i] + A[i + 1]) / 2;
            if (avarage > mid) {
                avarage = mid;
                position = i;
            }
        }

        return position;
    }
}
