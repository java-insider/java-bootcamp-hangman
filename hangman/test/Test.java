package hangman.test;

import hangman.core.Dictionary;

public class Test {

    public static void main(String[] args) {
//        Word w = new Word("java");
//        System.out.println(w);
//
//        System.out.println(w.reveal('a'));
//        System.out.println(w);
//
//        System.out.println(w.reveal('x'));
//        System.out.println(w);

        //Dictionary dictionary = new Dictionary();
        Dictionary dictionary = Dictionary.instance();
        System.out.println(dictionary.nextWord());
        System.out.println(dictionary.nextWord());
        System.out.println(dictionary.nextWord());
    }
}
