

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{1, 0, 0, 1, 1, 1, 1};


        int result = solution.solution(A);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int[] A) {
        int counter = 0;
        if (A.length > 100000) {
            return -1;
        }
        int passingCars = 0;
        int zeroCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                passingCars += zeroCount;
            } else
                zeroCount++;
        }
        if (passingCars > 1000000000 || passingCars < 0)
            return -1;

        return passingCars;
    }
}