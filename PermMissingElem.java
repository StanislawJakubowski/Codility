
public class Main {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 6, 7, 8, 5, 9, 11};
        int result;
        Solution solution = new Solution();
        result = solution.solution(tab);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int[] A) {
        int lenght = A.length;
        if (lenght > 100000)
            return -1;
        int sumExpected = (lenght + 1) * (lenght + 2) / 2;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        return sumExpected - sum;
    }
}