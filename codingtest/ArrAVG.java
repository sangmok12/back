//배열들의 평균 구하기.




class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i=0;i<arr.length;i++) {
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}
