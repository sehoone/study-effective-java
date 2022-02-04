package chapter7.item46;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	private String name;
    private int releaseYear;
    private String author;

}
