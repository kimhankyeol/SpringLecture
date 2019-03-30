package kim.generic;

public class AutoBoxing {
	public static void main(String[] args) {
		//Integer myInt = new Int(10); 로 생성안해도 알아서 클래스 생성해준다.
		Integer myInt = 10; //이를 오토박싱이라고 한다.
		
		//원래는 myInt.intValue()로 써야되지만 Java 에서 알아서 변환되서 저장됨
		int mynum = myInt; //myInt객체를 정수 int 에 바로 대입시킴
		//이를 오토언박싱이라고함
	}
}
