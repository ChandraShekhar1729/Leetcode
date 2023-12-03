import java.util.*;

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        
        List<Integer> peak = new ArrayList<Integer>();
        
        if (mountain.length <= 2) {
            return peak;
        }
        
        for (int i = 1; i < mountain.length - 1; i++) {
            int num = mountain[i];
            if (num > mountain[i - 1] && num > mountain[i + 1]) {
                peak.add(i);
            }
        }
        
        return peak;
    }
}