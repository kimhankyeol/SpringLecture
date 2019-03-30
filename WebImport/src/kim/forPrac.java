package kim;

public class forPrac{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("----------------------------------------------");
        //foreach 문
        for(int e : arr){
            System.out.println(e+" ");
        }
    }

}