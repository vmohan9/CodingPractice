import java.util.Arrays;

public class HS {

	void sort(int[] arr){
		int n = arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		for(int i=n-1;i>=0;i--){
			int t = arr[0];
			arr[0]=arr[i];
			arr[i]=t;
			heapify(arr,i,0);
		}
		
	}
	
	void heapify(int[] arr,int n,int i){
		int max = i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<n && arr[l]>arr[max])
			max = l;
		if(r<n && arr[r]>arr[max])
			max = r;
		if(max!=i)
		{
			int t = arr[i];
			arr[i]=arr[max];
			arr[max]=t;
			heapify(arr,n,max);
		}
	}
	public static void main(String[] args){
		int arr[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Unsorted array: "+Arrays.toString(arr));
		HS ob = new HS();
		ob.sort(arr);
		System.out.println("Sorted array: "+Arrays.toString(arr));
	}
}
