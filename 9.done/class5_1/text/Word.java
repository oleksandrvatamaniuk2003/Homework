package text;

public class Word {
    private String value;
    public Word(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }
}
