package utility;

public class ChrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch = args[0].charAt(0);
		
		//args[0].char
		
		//char ch = 'p';
		
		switch (ch) {
		case 'a': System.out.println(ch+" is a vowel");
			break;
		case 'e': System.out.println(ch+" is a vowel");
		break;
		case 'i': System.out.println(ch+" is a vowel");
		break;
		case 'o': System.out.println(ch+" is a vowel");
		break;
		case 'u': System.out.println(ch+" is a vowel");
		break;

		default: System.out.println(ch+" is a consonent");
			break;
		}

	}

}
