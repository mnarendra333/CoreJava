package utility;

public class ExceptionDemo
{
	

	public static void main(String... args)
	{
			int div = 0;
			try
			{
				//div = 10/0;
				//String s1 = null;
				//s1.length();
				//Object obj = new Object();
				//String s1 = (String)obj;
				
				Thread t = new Thread();
				t.start();
				t.start();
				
				int no = Integer.parseInt(args[0]);
			}
			catch(NumberFormatException e ){
				e.printStackTrace();
				System.out.println("dont convert string into int");
			}
			catch(NullPointerException e){
				e.printStackTrace();
				System.out.println("do null check");
			}
			catch(ClassCastException e){
				e.printStackTrace();	
				System.out.println("check casting");
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("div of 2 no's "+div);
		
	}


}