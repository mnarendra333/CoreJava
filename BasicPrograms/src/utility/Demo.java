package utility;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "sees";
		
		char[] chars = s1.toCharArray();
		for (char c : chars) {
			System.out.println(c);
		}
		
		List<StringBuffer> stringlist = new ArrayList<StringBuffer>();
		for (int i = 0; i < chars.length; i++) {
			
			for (int j = 0; j < chars.length; j++) {
				StringBuffer sb = new StringBuffer();
				if(j!=i){
					
					sb.append(chars[i]).append(chars[j]).append(chars[j+1]).append(chars[j+2]);
					stringlist.add(sb);
				}
			}
		}
		
		System.out.println(stringlist);
		
		
		
		

	}

}
