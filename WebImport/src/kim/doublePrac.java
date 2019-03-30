package kim;

public class doublePrac {
	public static void main(String[] args) {
		double a = 10.001;
		double b = 10;
		
		double add = a + b;
		double sub = a - b;
		double mul = a * b;
		double div = a / b;
		//더하기  우리가 생각하는 연산값 4.001
		System.out.println("더하기:"+add);
		//빼기 우리가 생각하는 연산값 2.001
		System.out.println("빼기:"+sub);
		//곱셈  3.001
		System.out.println("곱하기:"+mul);
		//나눗셈 3.001
		System.out.println("나눗셈:"+div);
		
		/*
		 ctrl + f11 로 실행
		 분명 우리가 생각하는 연산값은 저건데 
		 확인하면 다른것을 볼수 있음 
		 그것이 왜 그럴까 ? 
		 생각하고 공부하고 오셈 
		 */
	}
}
