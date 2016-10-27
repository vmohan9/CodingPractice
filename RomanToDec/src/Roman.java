import java.util.Scanner;
public class Roman {

	public static int decValue(char c)
	{
		switch(c){
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		default : return 1000;
		}
	}
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String in; int dec=0; char prev;
	System.out.println("Enter input in roman:");
	in=input.next();
	char[] inArray = in.toCharArray();
	prev = inArray[1];
	//dec = decValue(inArray[0]);
	for(int i=0;i<inArray.length-1;i++){
		if(i<inArray.length-1){
			prev = inArray[i+1];
			if(decValue(prev)>decValue(inArray[i]))
			{
				System.out.println("char: "+dec);
				dec+=(decValue(prev)-decValue(inArray[i]));
				i++;
			}
			else 
			dec+=decValue(inArray[i]);
		}
		else
			dec+=decValue(inArray[i]);
		
		}
	
	System.out.println("Answer:"+dec);
	
	}
}
