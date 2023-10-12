//배열 순서 뒤집기





class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];  // 원하는 수의 배열 만들기
        for(int i = 0; i< num_list.length; i++){
            answer[i] = num_list[num_list.length-i-1];
        }
        return answer;
    }
}
