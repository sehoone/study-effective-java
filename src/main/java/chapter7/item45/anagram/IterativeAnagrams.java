package chapter7.item45.anagram;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class IterativeAnagrams {
    public static void main(String[] args) throws IOException {
    	/**
    	 * 사전파일에서 단어를 읽어 사용작사 지정한 값보다 원소수가 많은 아나그램 그룹을 출력.
    	 * 아나그램이란 철자를 구성하는 알파벳이 같고 순서만 다른 단어를 뜻함
    	 */
    	Path dictionary = Paths.get("C:/Users/meras/Documents/anagram.txt");
        int minGroupSize = 2;

        Map<String, Set<String>> groups = new HashMap<>();
        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                // computeIfAbsent 메서드. map안에 키가 있는지 찾아서 return. 키가 없다면 주어진 함수객체를 키에 적용하여 계산
                groups.computeIfAbsent(alphabetize(word),
                        (unused) -> new TreeSet<>()).add(word);
            }
        }

        for (Set<String> group : groups.values())
            if (group.size() >= minGroupSize)
                System.out.println(group.size() + ": " + group);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
