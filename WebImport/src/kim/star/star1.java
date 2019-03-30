package kim.star;

public class star1 {
	public static void main(String[] args) {
		int k = 1;
		for (int i =0; i>=0; i+=k ) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			if(i==5) {
				k= -1;
			}
		}
	}
}
	
