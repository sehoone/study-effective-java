package chapter11.item85;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Serializable{
	private static final long serialVersionUID = 1195298507646139125L;
	
	private String name;
	private int age;
}
