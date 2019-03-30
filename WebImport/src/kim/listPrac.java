package kim;

public class listPrac {

	public static void main(String[] args) {
		  //배열 안의 데이터 내림차순
	    int[] englishScores = {1,2,3,4};
	    	
	    int temp=0; //순서 변경시 임시로 값을 저장할때 사용하는 임시변수
	    for(int i = 0 ; i<englishScores.length; i++){
	        for(int j = 0; j<englishScores.length; j++){
	            if(englishScores[i] < englishScores[j]){
	                //내부의 값 비교 
	                temp = englishScores[i];
	                englishScores[i]=englishScores[j];
	                englishScores[j]=temp;
	            }
	        }
	        System.out.println(englishScores[i]+" ");//정렬된값 출력
	    }
	}
}
