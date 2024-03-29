public class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();

        int x = 0;
        int y = 0;
        String key = x + "_" + y;
        set.add(key);

        for (char ch : path.toCharArray()) {
            if (ch == 'E') {
                x += 1;
            } else if (ch == 'W') {
                x -= 1;
            } else if (ch == 'N') {
                y += 1;
            } else {
                y -= 1;
            }

            key = x + "_" + y;
            if (set.contains(key)) {
                return true;
            }
               else{
            set.add(key);

               }
        }

        return false;
    }
}