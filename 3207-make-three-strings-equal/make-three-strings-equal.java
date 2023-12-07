class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
         int a = s1.length(), b = s2.length(), c = s3.length();
        if (s1.charAt(0) != s2.charAt(0) || s2.charAt(0) != s3.charAt(0) || s1.charAt(0) != s3.charAt(0))
            return -1;

        int i = 0, j = 0, k = 0;
        while (i < a && j < b && k < c) {
            if (s1.charAt(i) != s2.charAt(j) || s2.charAt(j) != s3.charAt(k) || s1.charAt(i) != s3.charAt(k))
                break;
            i++;
            j++;
            k++;
        }
        return a - i + b - j + c - k;
    }
}