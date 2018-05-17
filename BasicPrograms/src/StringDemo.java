
public class StringDemo {

	public static void main(String[] args) {
	
		//String s1 = "today is working day";
		
		if(args.length>0){
			String tokens[] = args[0].split(" ");
			System.out.println(tokens.length);
		}else{
			System.out.println("please enter valid string");
		}
	}

}
