package kim.collectionClass;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionClass {
	public static void main(String[] args) {
		ArrayList<String> myStringArrays = new ArrayList<String>();
		myStringArrays.add("김");//배열 0번째 입력
		myStringArrays.add("한");//배열 1번째 입력
		
		String myString1 = myStringArrays.get(1); //배열 1번쨰 읽기
		System.out.println(myString1);
		
		myStringArrays.add(1, "java"); //배열 1번째 내용 추가 수정
		
		for(String myStringVar : myStringArrays) {
			System.out.println(myStringVar);
		}
		System.out.println();
		
		//Iterator
		Iterator<String> myIterator = myStringArrays.iterator();
		while(myIterator.hasNext()) {//다음 항목이 있는가 ?
			String myString = myIterator.next(); //다음 항목을 읽어온다.
			System.out.println(myString);
		}
		
		myStringArrays.remove(0); //배열 0번째 삭제
		for(String myStringVar: myStringArrays) {
			System.out.println(myStringVar);
		}
		
		
		
	}
}
