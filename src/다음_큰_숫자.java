class 다음_큰_숫자 {
    public int count_binary(String binaryString){
        int count = 0;
        char[] chars = binaryString.toCharArray();
        for (char ch : chars) {
            if (ch == '1') {
                count++;
            }
        }
        return count;
    }
    public int solution(int n) {
        int cnt = n;
        String binaryString = Integer.toBinaryString(n);
        long ref_count = count_binary(binaryString);
        while(true){
            cnt++;
            int com_count = count_binary(Integer.toBinaryString(cnt));
            if(ref_count == com_count){
                break;
            }

        }
        return cnt;
    }
    public static void main(String[] args) {
        다음_큰_숫자 sol = new 다음_큰_숫자();
        int n = 78;
        System.out.println(sol.solution(n));
    }
}