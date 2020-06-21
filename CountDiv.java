import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] AA = new int[]{4, 2, 2, 5, 1, 1, 5, 2, 1};

        int A = 6;
        int B = 12;
        int K = 2;

        int result = solution.solution(A, B, K);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int A, int B, int K) {

        if (A > B || A < 0 || A > 2000000 || B < 0 || B > 2000000 || K < 2 || K > 2000000) {
            return -1;
        }

//        for (int i = A; i <=B ; i++) {
//            if (i%K==0){
//                counter++;
//            }
//        }
        int counter = (B / K) - (A / K) + (A % K == 0 ? 1 : 0);


        return counter;
    }
}