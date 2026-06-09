public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) {
            return result;
        }

        int[] pfreq = new int[26];
        int[] windowfreq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pfreq[p.charAt(i) - 'a']++;
            windowfreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pfreq, windowfreq)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {

            windowfreq[s.charAt(i)-'a']++;
            windowfreq[s.charAt(i-p.length())-'a']--;

            if (Arrays.equals(pfreq, windowfreq)) {
                result.add(i-p.length()+1);
            }
        }

        return result;
    }
}
