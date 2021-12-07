package chapter2.item5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
    	System.out.println("isValid word " + word);
    	return true;
    }

    public List<String> suggestions(String typo) {
    	return new ArrayList<String>();
    }

    public static void main(String[] args) {
        Lexicon lexicon = new KoreanDictionary();
        SpellChecker spellChecker = new SpellChecker(lexicon);
        spellChecker.isValid("hello");
		/**
		 * 의존객체 주입
		 * 사용하는 자원에따라 달라지는 클래스는 정적유틸리티 클래스나 싱글턴 방식이 적합하지 않다
		 * 필요한 자원을 혹은 그자원을 만들어주는 팩토리를 생성자에 넘겨주자.
		 * 
		 */
    }

}

interface Lexicon {}

class KoreanDictionary implements Lexicon {}

class EnglishDictionary implements Lexicon {}