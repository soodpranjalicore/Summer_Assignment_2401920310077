public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
       int n = s.length();
       for(int l = 1; l <= n/2; l++) {
        if(n % l == 0) {
            String k = s.substring(0,l);
            StringBuilder sb = new StringBuilder();
            int times = n/l;
            for(int i = 0;i < times; i++) {
                sb.append(k);
            }
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        
       }  
       return false;
    }
}
