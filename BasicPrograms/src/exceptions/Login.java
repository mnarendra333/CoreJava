package exceptions;

import java.util.Scanner;

public class Login {
	
	
	public void validate(String uname, String pwd) throws ValidLoginException,InValidLoginException{
		
		//if(uname.equalsIgnoreCase("pragim") && pwd.equalsIgnoreCase("pragim"))
		if("pragim".equalsIgnoreCase(uname) && "pragim".equalsIgnoreCase(pwd)){
			throw new ValidLoginException("login success");
		}else
			throw new InValidLoginException("login denied");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		Thread.sleep(120000);
		Login obj = new Login();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cred");
		String name = sc.next();
		String pwd = sc.next();
		try {
			obj.validate(name, pwd);
		} catch (ValidLoginException | InValidLoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
