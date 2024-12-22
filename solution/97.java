import java.util.HashSet;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */
class Solution97{
    public int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> win = new HashSet<>();
        for (int winNum : win_nums) {
            win.add(winNum);
        }

        int zero = 0, match = 0;

        for (int lotto : lottos) {
            if (lotto == 0) zero++;
            else if (win.contains(lotto)) match++;
        }

        return new int[]{7 - Math.max((match + zero), 1), 7 - Math.max(match, 1)};
    }
}
