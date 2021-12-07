package chapter2.item5.single1;

import java.util.ArrayList;
import java.util.List;

public class SpellChecker {

    private final Lexicon dictionary = new KoreanDictionary();

    public SpellChecker() {
    }

    public static boolean isValid(String word) {
    	System.out.println("isValid word " + word);
    	return true;
    }

    public static List<String> suggestions(String typo) {
    	return new ArrayList<String>();
    }

    public static void main(String[] args) {
    	SpellChecker.isValid("hello");
    }

}

interface Lexicon {}

class KoreanDictionary implements Lexicon {}
