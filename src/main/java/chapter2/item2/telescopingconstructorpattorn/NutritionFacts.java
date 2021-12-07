package chapter2.item2.telescopingconstructorpattorn;

public class NutritionFacts {
    private final int servingSize;  // (mL)            required
    private final int servings;     // (per container) required
    private final int calories;     // (per serving)   optional
    private final int fat;          // (g/serving)     optional
    private final int sodium;       // (mg/serving)    optional
    private final int carbohydrate; // (g/serving)     optional

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }
    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize  = servingSize;
        this.servings     = servings;
        this.calories     = calories;
        this.fat          = fat;
        this.sodium       = sodium;
        this.carbohydrate = carbohydrate;
    }
	public static void main(String[] args) {
        /**
         * 1. 점층적 생성자 패턴
         * 선택 매케변수를 전부다 받는 생성자까지 늘려가는 방식
         * 점층적 생성자 패턴도 쓸수는 있지만, 매개변수 개수가 많아지면 클라이언트 코드를 작성하거나 읽기 힘들다
         */
		
		// 객체를 생성할떄, 매개변수가 많으면 순서대로 넣는것을 작성하거나 읽기 힘듬.
		NutritionFacts cocaCola =
                new NutritionFacts(240, 8, 100, 0, 35, 27);
		
        System.out.println("cocaCola " + cocaCola.servingSize);

	}

}
