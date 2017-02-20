
public class RevStringCapitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "How Are You Doing Today";
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for(int i=input.length()-1;i>=0;i--){
			if(flag==false){
				sb.append(Character.toUpperCase(input.charAt(i)));
				flag = true;
			}
			else if(input.charAt(i)==' '){
				sb.append(input.charAt(i));
				sb.append(Character.toUpperCase(input.charAt(i-1)));
				i--;
			}
			else
				sb.append(Character.toLowerCase(input.charAt(i)));
		}
		System.out.println("answer: "+sb.toString());
	}

}
