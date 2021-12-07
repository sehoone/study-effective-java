package chapter2.item3.enumtype;

public enum Elvis{
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
    	/**
    	 * 3. enum 방식의 싱글턴
    	 * 원소가 하나인 열거타입을 선언하는방식
    	 * 
    	 */
        Elvis elvis1 = Elvis.INSTANCE;
        elvis1.leaveTheBuilding();
        System.out.println("elvis1 adress" + elvis1);
        
        Elvis elvis2 = Elvis.INSTANCE;
        elvis2.leaveTheBuilding();
        System.out.println("elvis2 adress" + elvis2);
    }
}
