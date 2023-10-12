//배열의 합의 평균 구하기



class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int numlen = numbers.length;
        for (int i : numbers) {
            answer += i;
        }
        answer /= numlen;
        
        return answer;
        
        
    }
}
