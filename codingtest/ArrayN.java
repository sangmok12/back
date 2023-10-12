//배열에 n 의 갯수가 몇개인지 구하기



class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i : array) {
            if (i == n) answer += 1;
        }
        return answer;
    }
}
