import java.util.*;
public class Denom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = 0;
		int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		System.out.println("Enter amount:");
		amount = in.nextInt(); int count = 0;
		ArrayList<Integer> res = new ArrayList<Integer>(); 
		while(amount!=0){
			int l = 0;
			for(int i =0;i<deno.length;i++){
				if(amount>=deno[i])
				{
					l = deno[i];
				}
				else
					break;
			}
			amount = amount - l;
			res.add(l);
			count++;
			
		}
		System.out.println("answer:"+count);
		System.out.println(res);
		
	}

}
