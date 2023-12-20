import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        // h번 이상 인용된 논문이 h편 이상이고, 나머지 논문이 h편 이하 인용됐다면 max(h)가 h-index
        Arrays.sort(citations);
        int maxH = citations[n-1];
        for (int h = maxH; h >= 0; h--) {
            int graterThanOrEqaulToH = 0;
            for (int j = 0; j < n; j++) {
                if (citations[j] >= h) {
                    graterThanOrEqaulToH += 1;
                }
            }
            if (graterThanOrEqaulToH >= h && graterThanOrEqaulToH <= n + h) {
                return h;
            }
        }
        return -1;
    }
}
