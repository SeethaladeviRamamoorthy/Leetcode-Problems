class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        return words.length == pattern.length() && IntStream.range(0, words.length).allMatch(i -> pattern.indexOf(pattern.charAt(i)) == Arrays.asList(words).indexOf(words[i]));
        
    }
}