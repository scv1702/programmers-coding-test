import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        boolean[] reserveArr = new boolean[n];
        boolean[] lostArr = new boolean[n];
        
        Arrays.sort(lost);
        
        for (int r: reserve) {
            reserveArr[r-1] = true;
        }
        
        for (int l: lost) {
            lostArr[l-1] = true;
        }
        
        for (int l: lost) {
            if (reserveArr[l-1]) { // 여벌 체육복을 가져온 학생이 도난당한 경우
                reserveArr[l-1] = false;
                answer++;
            } else if (l-2 >= 0 && reserveArr[l-2] && !lostArr[l-2]) {
                reserveArr[l-2] = false;
                answer++;
            } else if (l < n && reserveArr[l] && !lostArr[l]) {
                reserveArr[l] = false;
                answer++;
            }
        }
        
        return answer;
    }
}
