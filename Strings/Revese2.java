    class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder string = new StringBuilder();
        for(int i = 0; i<n; i=i+2*k){
            int j = Math.min(i+k, n);
            StringBuilder rev = new StringBuilder(s.substring(i, j));
            rev.reverse();
            string.append(rev);
            string.append(s.substring(j, Math.min(i+2*k, n)));
        }
        return string.toString();
    }
}