import java.util.HashMap;

public class CountPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 1, 1};int count = 0;
		int k = 6;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
				hm.put(arr[i],1);
		}
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(k-arr[i]))
				count+=hm.get(k-arr[i]);
			if(k-arr[i] == arr[i])
				count--;
		}
		
		System.out.println("Answer: "+count/2);
	}

}
