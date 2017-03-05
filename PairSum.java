import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,2,3,3};
		int sum = 6;
		Set<Integer> hm = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			if(hm.contains(sum-arr[i])){
				System.out.println((sum-arr[i])+" "+arr[i]);
			}
			else
				{
					hm.add(arr[i]);
					/*Iterator<Integer> iter = hm.iterator();
					System.out.println("Status:");
					while(iter.hasNext()){
						System.out.print(iter.next()+" ");
					}*/
				}
		}

	}

}
