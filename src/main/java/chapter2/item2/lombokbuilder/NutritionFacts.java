package chapter2.item2.lombokbuilder;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;

@Builder
public class NutritionFacts {
    @Builder.Default private final int servingSize = 10;
    private final int servings;     
    private final int calories;    
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

	public static void main(String[] args) {
		NutritionFacts cocaCola = NutritionFacts.builder()
                .calories(100).sodium(35).carbohydrate(27).build();
		
		System.out.println("cocaCola servingSize " + cocaCola.servingSize);
		System.out.println("cocaCola calories " + cocaCola.calories);
		
		List<Model1> aa = new ArrayList<Model1>();
		System.out.println(aa.toString());
		Model1 dm1 = new Model1();
		dm1.setAa("asd");
		aa.add(dm1);
		System.out.println(aa);
		
		Model1 dm2 = new Model1();
		dm2.setAa("asqwd");
		aa.add(dm2);
		System.out.println(aa);
	}

}