package hangman.core;

public class Word {
    private static final char HIDDEN_CHAR = '_';

    private final char[] letters;
    private final char[] hiddenLetters;

    public Word(String text) {
        letters = text.toUpperCase().toCharArray();
        hiddenLetters = String.valueOf(HIDDEN_CHAR).repeat(text.length()).toCharArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char l : hiddenLetters) {
            sb.append(l).append(" ");
        }

        return sb.toString().trim();
    }

    public boolean reveal(char letter) {
        char upperLetter = Character.toUpperCase(letter);
        boolean replaced = false;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == upperLetter) {
                hiddenLetters[i] = upperLetter;
                replaced = true;
            }
        }

        return replaced;
    }

    public boolean revealed() {
        return toString().indexOf(HIDDEN_CHAR) == -1;
    }

    public String show() {
        return String.valueOf(letters);
    }
}
