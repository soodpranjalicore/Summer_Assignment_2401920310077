public class StringCompression {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;
        while(i < chars.length) {
            int j = i;
            while(j < chars.length && chars[i] == chars[j]) {
                j++;
            } 
            int count = j - i;
            chars[idx++] = chars[i];
            if(count > 1) {
                char[] freq = Integer.toString(count).toCharArray();
                for(char ch : freq) {
                    chars[idx++] = ch;
                }
            }
            i = j;

        }
        return idx;
    }
}
