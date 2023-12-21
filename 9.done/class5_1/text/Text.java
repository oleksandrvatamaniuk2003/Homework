package text;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private String title;
    private List<Sentence> sentences;
    public Text(String title) {
        this.title = title;
        this.sentences = new ArrayList<>();
    }
    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }
    public void displayText() {
        System.out.println("Title: " + title);
        for (Sentence sentence : sentences) {
            System.out.print(sentence);
        }
        System.out.println();  // Add a new line after the text
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Text{" +
                "title='" + title + '\'' +
                ", sentences=" + sentences +
                '}';
    }
}
