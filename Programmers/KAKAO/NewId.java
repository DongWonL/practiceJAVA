package programmers;

import java.util.Scanner;

/**
 * @author DongWonL
 * @date 2022. 3. 20. - 오후 2:21:08
 * @subject	
 * @content	
 */
public class NewId {

	public static void main(String[] args) {
		try (
				Scanner sc = new Scanner(System.in);
			){
			
			String new_ID;
			
			
			do {
				System.out.print("ID를 입력하세요: ");
				new_ID = sc.next();
				if(new_ID.length() < 3 && new_ID.length() > 15) System.out.println("아이디는 3글자 이상 15글자 이하입니다. 다시 입력");
				
			} while (!(new_ID.length() >= 3 && new_ID.length() <= 15));

			new_ID = new_ID.toLowerCase();
			
			new_ID = new_ID.replaceAll("[^-_.a-z0-9]", "");
			
			new_ID = new_ID.replaceAll("[.]{2,}", ".");
			
			new_ID = new_ID.replaceAll("^[.]|[.]$","");
			
			if(new_ID.equals("")) new_ID = "a";
			
			if(new_ID.length() >= 16) new_ID = new_ID.substring(0, 15);
			
			if(new_ID.length() <= 2) {
				while(new_ID.length() != 3) {
					new_ID += new_ID.charAt(new_ID.length()-1);
				}
			}
			
			System.out.println(new_ID);

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Solution {
    public String solution(String new_id) {
        
    	new_id = new_id.toLowerCase();
			
    	new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
			
    	new_id = new_id.replaceAll("[.]{2,}", ".");
			
    	new_id = new_id.replaceAll("^[.]|[.]$","");
    	
		if(new_id.equals("")) new_id = "a";
			
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("[.]$","");
        }
        
		if(new_id.length() <= 2) {
			while(new_id.length() != 3) {
				new_id += new_id.charAt(new_id.length()-1);
			}
		}
        
        System.out.println(new_id);
        return new_id;
    }
}
