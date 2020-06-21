
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 1;
        int result = solution.solution(a);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int N) {
        StringBuilder sbFromInteger = new StringBuilder(String.valueOf(Math.abs(N)));

        if (N >= 0) {
            int i = 0;
            while (i < sbFromInteger.length() && (sbFromInteger.charAt(i) - '0') >= 5) {
                i++;
            }
            sbFromInteger.insert(i, 5);
        } else {
            int i = 0;
            while (i < sbFromInteger.length() && (sbFromInteger.charAt(i) - '0') <= 5)
                i++;
            sbFromInteger.insert(i, 5);
        }
        int result = Integer.parseInt(sbFromInteger.toString());

        if (N >= 0)
            return result;
        else
            return -result;

    }
}
