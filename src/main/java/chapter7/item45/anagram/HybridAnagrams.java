package chapter7.item45.anagram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class HybridAnagrams {
	/**
	 * 스트림, 연산메서드를 절중하여 처리.
	 *
	 * 스트림으로 바꾸는게 가능하더라도 가독성과 유지보수 측천에서 손해보지 않게 작성하는게 좋다.
	 * 
	 */
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get("C:/Users/meras/Documents/anagram.txt");
        //int minGroupSize = Integer.parseInt(args[1]);
        int minGroupSize = 2;
        try (Stream<String> words = Files.lines(dictionary)) {
            words.collect(groupingBy(word -> alphabetize(word)))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(g -> System.out.println(g.size() + ": " + g));
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
