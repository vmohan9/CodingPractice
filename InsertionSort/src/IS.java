import java.util.Arrays;

public class IS {
public static void main(String[] args){
	int[] arr = {4,2,6,1,7,10,3};
	int key = 0;
	for(int i=1;i<arr.length;i++){
		key = arr[i];
		int j = i-1;
		while(j>=0 && key<arr[j]){
			arr[j+1]=arr[j];
			j--;
		}
		arr[++j]=key;
	}
	System.out.println("sorted array: "+Arrays.toString(arr));
}
}
