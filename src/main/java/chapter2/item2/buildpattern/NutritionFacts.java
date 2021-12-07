package chapter2.item2.buildpattern;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories      = 0;
        private int fat           = 0;
        private int sodium        = 0;
        private int carbohydrate  = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings    = servings;
        }

        public Builder calories(int val)
        { calories = val;      return this; }
        public Builder fat(int val)
        { fat = val;           return this; }
        public Builder sodium(int val)
        { sodium = val;        return this; }
        public Builder carbohydrate(int val)
        { carbohydrate = val;  return this; }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
    	/**
    	 * 3. 빌더 패턴
    	 * 클라이언트는 필요한 객체를 직접만드는 대신, 필수 매게변수만으로 생성자를 호출해 빌더 객체를 얻는다.
    	 * 빌더메소드를 호출하여 필요객체를 얻는다.
    	 * 
    	 * 생성자나 정적팩토리가 처리해야할 매개변수가 많다면 빌더 패턴을 선택하는게 낫다
    	 * 
    	 */
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
        
        System.out.println("cocaCola " + cocaCola.servingSize);
    }
}