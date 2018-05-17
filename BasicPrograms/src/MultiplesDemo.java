public class MultiplesDemo {

	public void printMultiples(int number) {

		for (int i = 1; i <= 100; i++) {

			if (i % number == 0)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = Integer.parseInt(args[0]);
		
		MultiplesDemo obj = new MultiplesDemo();
		obj.printMultiples(no);
		
		

	}
}
