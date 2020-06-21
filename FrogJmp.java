
public class Main {
    public static void main(String[] args) {

        int X;
        int Y;
        int D;
        int result;
        Solution solution = new Solution();
        result = solution.solution(1, 10, 7);
        System.out.println("Result is " + result);
    }
}

class Solution {
    public int solution(int X, int Y, int D) {

        int l = Y - X;
        if (l % D != 0)
            return (Y - X) / D + 1;
        else
            return (Y - X) / D;
    }
}
