class JadenCase {
        public String solution(String s) {
            String ans = "";
            // 모든 문자열 소문자로 변경
            String[] srr = s.toLowerCase().split("");
            boolean isFirst = true;
            for (String value : srr) {
                // 첫 글자일 경우 대문자로 변경
                ans += isFirst ? value.toUpperCase() : value;
                // 공백이 나오면 첫 글자 플래그 true로 변경
                isFirst = value.equals(" ");
            }
            return ans;
        }
    public static void main(String[] args) {
        JadenCase sol = new JadenCase();
        String s = "3pe4ople unFolloWed AmAe";
        System.out.println(sol.solution(s));
    }
}