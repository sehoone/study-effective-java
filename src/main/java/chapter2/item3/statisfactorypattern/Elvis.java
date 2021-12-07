package chapter2.item3.statisfactorypattern;

public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() { }
    public static Elvis getInstance() { 
    	return INSTANCE;
    	// return new Elvis();
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
    	/**
    	 * 2. 정적 팩토리 방식의 싱글턴
    	 * 생성자를 private 로 감춰두고, 유일한 인스턴스에 접근할수있는 수단을 만듬
    	 * 예외는 한가지, 권한이 있는 클라이언트는 리플렉션 API를 사용해 생성자를 호출할수있다
    	 * 
    	 * 첫번째, 마음이 바뀌면 싱글톤이 아니게 변경할수있다.
    	 * 두번째, 제네릭 싱글턴 팩토리로 만들수있다.(이건 잘 모르겠음)
    	 * 세번째, 메소드 참조를 공급자로 사용할수있다는점.(공급자?? getinstance를 통해서 인스턴스를 주는것을 말하는건가)
    	 */
        Elvis elvis1 = Elvis.getInstance();
        elvis1.leaveTheBuilding();
        System.out.println("elvis1 adress" + elvis1);
        
        Elvis elvis2 = Elvis.getInstance();
        elvis2.leaveTheBuilding();
        System.out.println("elvis2 adress" + elvis2);
    }
}
