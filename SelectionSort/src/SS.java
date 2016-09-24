import java.util.Arrays;

public class SS {

	public static void main(String[] args){
		int[] arr = {10,5,1,9,6,3};
		int min=0;
		System.out.println("unsorted array:");
		for(int i:arr)
			System.out.print(i+" ");
		for(int i=0;i<arr.length;i++){
			min = i;
			for(int j=i+1;j<arr.length;j++)
				{if(arr[j]<arr[min])
					min = j;}
			int t = arr[i];
			arr[i] = arr[min];
			arr[min] = t;
		}
		
		System.out.println("sorted array: "+Arrays.toString(arr));
	}
}
