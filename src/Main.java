class Solution {
    public String solution(String s) {
        int min_value = 0;
        int max_value = 0;
        int parseInt = 0;
        int cnt = 0;
        String[] s1 = s.split(" ");
        for (String string : s1) {
            parseInt = Integer.parseInt(string);
            if (cnt == 0) {
                min_value = parseInt;
                max_value = parseInt;
            }
             else if (parseInt < min_value) {
                min_value = parseInt;
            } else if (parseInt > max_value) {
                max_value = parseInt;
            }
            cnt++;
        }
        String answer = "";
        answer = min_value + " " + max_value;
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "1 2 3 4";
//        String s = "-1 -2 -3 -4";
        System.out.println(sol.solution(s));
    }
}