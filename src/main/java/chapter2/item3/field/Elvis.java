package chapter2.item3.field;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() { }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
    	/**
    	 * 1. static final 필드 방식의 싱글턴
    	 * 생성자를 private 로 감춰두고, 유일한 인스턴스에 접근할수있는 수단을 만듬
    	 * 예외는 한가지, 권한이 있는 클라이언트는 리플렉션 API를 사용해 생성자를 호출할수있다
    	 * 
    	 * private static 필드가 final이니 절대로 다른 참조 할수없다. 두번째 장점은 간결함이다.
    	 */
        //Elvis elvis1 = Elvis.INSTANCE;
        Elvis elvis1 = new Elvis();
        elvis1.leaveTheBuilding();
        System.out.println("elvis1 adress" + elvis1);
        
        Elvis elvis2 = Elvis.INSTANCE;
        elvis2.leaveTheBuilding();
        System.out.println("elvis2 adress" + elvis2);
    }
}