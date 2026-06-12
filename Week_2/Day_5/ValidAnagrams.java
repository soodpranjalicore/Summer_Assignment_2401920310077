public class ValidAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String word : strs) {

            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedWord = new String(letters);
            groups.putIfAbsent(sortedWord, new ArrayList<>());
            groups.get(sortedWord).add(word);
        }

        return new ArrayList<>(groups.values());

    }
}
