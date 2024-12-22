import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12987
 */
class Solution94{

    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int l = B.length - 1;
        int answer = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] < B[l]) {
                l--;
                answer++;
            }
        }

        return answer;
    }

}
