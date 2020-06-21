public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] tab = new int[]{1, 2, 3, 4, 5, 6};
        int[] newTab;
        int rotate = 2;


        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("");

        newTab = solution.solution(tab, rotate);
        for (int i = 0; i < newTab.length; i++) {
            System.out.print(newTab[i] + " ");
        }
    }
}

class Solution {
    public int[] solution(int[] A, int k) {
        if (A == null)
            return null;

        int lenght = A.length;
        int[] B = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            B[(i + k) % lenght] = A[i];
        }
        return B;
    }
}

