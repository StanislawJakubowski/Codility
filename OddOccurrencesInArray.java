import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] tab = new int[]{2, 2, 1, 1, 1, 1, 6, 6, 7, 6, 7};
        int result = solution.solution(tab);
        System.out.println("Result is " + result);
    }

}

class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> mapOfIntegersAndCounters = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (!mapOfIntegersAndCounters.containsKey(A[i]))
                mapOfIntegersAndCounters.put(A[i], 1);
            else {
                int counter = mapOfIntegersAndCounters.get(A[i]) + 1;
                mapOfIntegersAndCounters.put(A[i], counter);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapOfIntegersAndCounters.entrySet()
        ) {
            if (entry.getValue() % 2 != 0)
                return entry.getKey();
        }
        return -1;
    }
}
