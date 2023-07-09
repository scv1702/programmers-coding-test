class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                answer[j] += x;
            }
        }
        return answer;
    }
}
