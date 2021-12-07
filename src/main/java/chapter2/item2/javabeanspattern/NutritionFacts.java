package chapter2.item2.javabeanspattern;

public class NutritionFacts {
    private int servingSize  = -1;
    private int servings     = -1;
    private int calories     = 0;
    private int fat          = 0;
    private int sodium       = 0;
    private int carbohydrate = 0;

    public NutritionFacts() { }
    // Setters
    public void setServingSize(int val)  { servingSize = val; }
    public void setServings(int val)     { servings = val; }
    public void setCalories(int val)     { calories = val; }
    public void setFat(int val)          { fat = val; }
    public void setSodium(int val)       { sodium = val; }
    public void setCarbohydrate(int val) { carbohydrate = val; }

    public static void main(String[] args) {
    	/**
    	 * 2. 자바빈즈 패턴
    	 * 코드가 길어지긴 하지만 인스턴스를 만들기 쉅고, 읽기 쉬운코드
    	 * 단점_객체 하나를 만들려면 메서드를 여러개 호출해야하고, 객체가 완전히 생성되지 전짜기는 일관성이 무너진 상태
    	 */
    	
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(241);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
        //여기까지 set이 되어야 원하는 인스턴스가 만들어지지만 그 전까지는 완전하지 않은 일관서잉 무너진 상태
        
        System.out.println("cocaCola " + cocaCola.servingSize);
    }
}