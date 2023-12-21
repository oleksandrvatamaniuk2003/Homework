import text.Text;
import text.Sentence;
import text.Word;

public class MainProgramText {
    public static void main(String[] args) {
        Text myText = new Text("My Sample Text");
        Sentence sentence1 = new Sentence();
        sentence1.addWord(new Word("This"));
        sentence1.addWord(new Word("is"));
        sentence1.addWord(new Word("the"));
        sentence1.addWord(new Word("first"));
        sentence1.addWord(new Word("sentence"));

        Sentence sentence2 = new Sentence();
        sentence2.addWord(new Word("And"));
        sentence2.addWord(new Word("this"));
        sentence2.addWord(new Word("is"));
        sentence2.addWord(new Word("the"));
        sentence2.addWord(new Word("second"));
        sentence2.addWord(new Word("sentence"));

        // dodayemo rechennia
        myText.addSentence(sentence1);
        myText.addSentence(sentence2);

        // vyvid textu
        myText.displayText();

        // vyvid nazvy
        System.out.println("Text Title: " + myText.getTitle());
    }
}
