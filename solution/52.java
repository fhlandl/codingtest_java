import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */
class Solution52 {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> o1.charAt(n) == o2.charAt(n) ? o1.compareTo(o2) : Character.compare(o1.charAt(n), o2.charAt(n)));
        return strings;
    }

}
