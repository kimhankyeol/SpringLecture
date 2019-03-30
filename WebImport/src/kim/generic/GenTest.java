package kim.generic;

public class GenTest {
	public static void main(String[] args) {
		MyGeneric<String> sampleClass = new MyGeneric<String>("안녕");
		String str1 = sampleClass.getMyVar();
		System.out.println(str1);
	
	}
}
