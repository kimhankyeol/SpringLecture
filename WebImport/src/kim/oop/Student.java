package kim.oop;

public class Student {
/*객체지향은 객체(클래스)라는 작은 단위로 프로그래밍을 한다는 것을 의미
 * 객체지향 기법에서 객체는 레고 블록이고 레고블록을 조립하면 하나의 프로그램이 된다
 * 단위블럭(객체) 단위로 잘게 나누어서 코딩을하고 조립해서 복잡한 프로그램을 만든다.
 * 
 * 클래스의 멤버 변수는 클래스 내의 메소드에서만 값을 읽고 수정할 수 있으며 특정클래스는 비슷한 일을 처리하는 메소드 들의 집합체 이기 때문에 다른 클래스와 독립적인 레고블럭이하고 생각하면 됨
 * 외부에 오픈하지 않고 블랙박스 처럼 만들어서 독립적으로 작동할수 있게 한는것을 캡슐화 또한 멤버변수를 외부에서 접근하지 못하게 막는 것응ㄹ 정보 은닉
 * 
 * 다른클래스끼리 상호작용
 * 1. 상속
 * 2. 호출
 * 
 * 클래스를 정의하는 것을 선언한다고 한다.
 * 클래스를 생성(new)하고 생성된 클래스의 메소드를 호출하는 식으로 클래스르 사용하게 됨 
 * 클래스를 생성하는것을 인스턴스화 라고함
 * 
 * 붕어빵 만드는틀(기계) 클래스 
 * 생성되어진 인스턴스는 틀을 통해 만들어진 붕어빵
 * 틀= 클래스,  붕어빵 = 인스턴스
 * 
 * Circle abc = new Circle()
 * 
 * Circle 과 동일한데 괄호 () 추가 되어있음
 * 이러한 특별한 함수(메소드)를 생성자라고 한다.
 * 클래스의 인스턴스 변수인 abc 가지고 메소드 호출할수있다.
 * 
 * abc.getArea()  
 * */
	
	String name;
	double gpa;
	
	public Student (String pName, double pGpa) {//파라미터를 입력받는 생성자
		name=pName;
		gpa=pGpa;
	}
	
	public String getName() {
		return name;
	}
	public double getGpa() {
		 return gpa;
	}
	
	//에러 o
	//oop a = new oop();
	
	//에러 x
	//Student b = new Student("김한결",4.2);
	
	
}
