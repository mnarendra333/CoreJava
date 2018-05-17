package pack1;

public class DemoFinal {
	
	final int x = 10;
	
	
	/*public void changeMe(){
		//this.x = 
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DemoFinal obj = new DemoFinal();
		//obj.x = 30;
		
		String str = new String("Aparanji");
		String str2 = str + "test";
		System.out.println(str+" "+str2);
		
		StringBuffer sb = new StringBuffer("Aparanji");
		sb.append("test");
		System.out.println(sb);
		

	}

}
