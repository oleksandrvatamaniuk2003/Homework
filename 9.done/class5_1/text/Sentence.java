package text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;
    public Sentence() {
        this.words = new ArrayList<>();
    }
    public void addWord(Word word) {
        words.add(word);
    }
    @Override
    public String toString() {
        StringBuilder sentenceBuilder = new StringBuilder();
        for (Word word : words) {
            sentenceBuilder.append(word).append(" ");
        }
        sentenceBuilder.append(". ");  // Assume each sentence ends with a period
        return sentenceBuilder.toString();
    }
}
