public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] s1freq = new int[26];
        int[] windowfreq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
           s1freq[s1.charAt(i) - 'a']++;
           windowfreq[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(s1freq,windowfreq)) {
            return true;
        }
        for(int i = s1.length();i < s2.length();i++) {
            windowfreq[s2.charAt(i)-'a']++;
            windowfreq[s2.charAt(i-s1.length())-'a']--;
            if (Arrays.equals(s1freq, windowfreq)) {
                return true;
            }  
        }
        return false;
    }
}