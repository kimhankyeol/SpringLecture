package kim.generic;

public class genericPrac<TYPE> {
	//TYPE은 String , Integer , Double 등 사용할때 지정
	TYPE[] myArrays; //TYPE 형태의 배열을 담아둘 수 있는 변수
	
	boolean add(TYPE e) { //배열에 TYPE 형태의 원소 e를 추가하는 메소드
		myArrays[10] = e;
		return true;
	}
	
	//ArrayList 가 아래 기능을 제공하여 2마리 토끼를 잡은것
	//1. 아무형태나 다원하는대로 사용
	//2.타입도 지정할수 있으니까 컴파일 시에 오류 체크를 하고 실행시에는 문제가없음
}
