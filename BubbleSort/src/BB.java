import java.util.Arrays;

public class BB {
public static void main(String[] args){
	int[] arr = {10,5,1,7,3};
	boolean swap = false;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length-i-1;j++){
			if(arr[j]>arr[j+1]){
				int t = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=t;
				swap = true;
			}
		}
		if(!swap)
			break;
	}
	System.out.println("Sorted array: "+Arrays.toString(arr));
}
}
