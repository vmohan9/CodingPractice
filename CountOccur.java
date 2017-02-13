import java.util.*;
public class CountOccur {

	public static void main(String[] args){
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		String input = "I am here too am here am";
		String[] words = input.split(" ");
		for(String i:words){
			if(!hm.containsKey(i)){
				System.out.println("if "+i);
				hm.put(i, 1);
			}
			else{
				System.out.println("else "+i);
				hm.put(i, hm.get(i)+1);
			}
				
	
		}
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
