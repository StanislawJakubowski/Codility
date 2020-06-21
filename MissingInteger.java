import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{7, 4, 3, 1, 1, 5, 3, 6, 2, 4, 17};
        int[] B = new int[]{-4, -6, -5, -6};
        int[] C = new int[]{-1, -1, 1, 1, 2, 4};

        int result = solution.solution(C);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int[] A) {
        HashSet<Integer> serOfPositiveNumbers = new HashSet<>();
        int[] tab = A;

        for (int i = 0; i < tab.length; i++) {
            if (A[i] < 0)
                continue;
            else {
                serOfPositiveNumbers.add(A[i]);
            }
        }

        for (int i = 1; i <= tab.length; i++) {
            if (!serOfPositiveNumbers.contains(i)) {
                return i;
            }
        }
        return tab[tab.length - 1] + 1;
    }
}
