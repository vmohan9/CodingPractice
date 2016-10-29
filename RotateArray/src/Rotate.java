import java.util.Arrays;

public class Rotate {

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		int[] temp = new int[n];
		int d = 2;
//		for(int i=0;i<n;i++){
//			temp[(n-d+i)%n]=arr[i];
//		}
		for(int i=0;i<d;i++)
			rotate(arr,n);
		System.out.println(Arrays.toString(arr));
	}
	public static void rotate(int[] arr,int n){
		int temp = arr[0];int i;
		for(i=1;i<n;i++){
			arr[i-1]=arr[i];
		}
		arr[i-1]=temp;
	}
}
