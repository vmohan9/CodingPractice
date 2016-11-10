import java.util.*;
public class Odd {

	/*@Override
	public String toString(){
		return this.
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {1,2,3,4,1,2,1,2,3,5,4,4};
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(li.contains(arr[i]))
				li.remove(new Integer(arr[i]));
			else
				li.add(arr[i]);
		}
		
		System.out.println(li.toString());
	}

}
