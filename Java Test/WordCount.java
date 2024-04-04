import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "Life is a journey. A journey full of twists and turns";
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = str.split("\\s+");

        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "");
            
            word = word.toLowerCase();

            if (word.length() > 0) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
