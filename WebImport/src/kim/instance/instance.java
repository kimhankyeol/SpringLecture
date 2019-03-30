package kim.instance;

//예제 
class 붕어빵틀 {
	static int 가격 = 500;
	static String 겉모양 = "붕어모양";
	static String 겉재료 = "밀가루";

	String 내용물;

	public 붕어빵틀(String strInner) {
		내용물 = strInner;
	}
}


public class instance {
	public static void main(String[] args) {
		
		붕어빵틀 myFish아이스크림 = new 붕어빵틀("아이스크림");
		붕어빵틀 myFish크림 = new 붕어빵틀("크림");
		
		System.out.println(myFish아이스크림.내용물);//인스턴스 변수
		System.out.println(붕어빵틀.가격);//클래스변수 ( 스태틱으로 선언되어 공통적으로 쓰이는 변수);
		System.out.println(붕어빵틀.겉모양);//클래스 변수
		System.out.println(붕어빵틀.겉재료);//클래스 변수
		
		System.out.println(myFish아이스크림.가격);
		//클래스 변수를 인스턴스명으로 사용가능
		System.out.println(myFish아이스크림.겉모양);
		//클래스 변수를 인스턴스명으로 사용가능
		System.out.println(myFish아이스크림.겉재료);
		//클래스 변수를 인스턴스명으로 사용가능
		
		
		//String myString  = new String("안녕하세요");
		//myString 은 변수임
		//프로그램에서 실제 사용되어지는 실체이다 
		//String 클래스라는 틀을 이용해 만들어낸 실체인 것이다
		//new String()을 하면 java가 사용하는 메모리에 올라가서 실체가 되는것임
		//new String 해서 메모리에 하나의 실체로 만들어진 결과물을 인스턴스 라고함

	
	/*
	  class 붕어빵틀{
		  public 붕어빵틀(String strInner){
		  	내용물  = strInner;
		  }
	  
	  }
	  
	 public class 붕어빵만들기{
	 	public static void main(String[] args) {
		 붕어빵틀 myFish아이스크림  = new 붕어빵틀("아이스크립");
		 붕어빵틀 myFish크림 = new 붕어빵틀("크림"); 
		 }
	 } 
	 ----static 지정자로 클래스 변수 만들기---------- 
	  붕어빵틀로 만들어낸 붕어빵들은 변수인 myFish아이스크림, myFish크림 dlek 
	  각각 메모리에 차지하고 있다.
	  내용물 변수에 각각 다른 String 값이 들어가 있어야 하므로, 당연히 다른공간에 저장되어야하는것임
	  
	  그런데 모든 붕어빵이 공통으로 사용하는 변수가 있다고 생각해봄
	  겉모습이 모두 붕어모양 겉재료 밀가루 모두 동일한값
	  동일한 값을 일일이 개별 설정하는 것도 귀찮을 뿐이고 메모리 공간도 쓸데없이 많이 잡아 먹는다.
	  이런 공통 변수들은 공통공간에 놓고 같이 공유해서 사용하도록 하자.
	  
	  
	  class 붕어빵틀{
	  	static int 가격 = 500;
	  	static String 겉모양 = "붕어모양";
	  	static String 겉재료 = "밀가루";
	  
	  
		  String 내용물;
		  public 붕어빵틀(String strInner){
		  	내용물 = strInner
		  }
	  }
	  
	  public class 붕어빵만들기 {
	  
	  public static void main(String[] args){
	  
		   	붕어빵틀 myFish아이스크림  = new 붕어빵틀("아이스크립");
			 붕어빵틀 myFish크림 = new 붕어빵틀("크림"); 
	  	}
	  }
	  
	  
	  공통공간 가격 , 겉모양 ,재료
	  
	 */
	
	}
}
