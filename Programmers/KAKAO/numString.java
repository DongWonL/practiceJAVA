package programmers;

/**
 * @author DongWonL
 * @date 2022. 3. 21. - 오전 10:29:30
 * @subject	
 * @content	
 */
public class numString {

}

class Solution_2 {
    public int solution(String s) {
        String[] numArray = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        
        for(int i = 0; i < num.length; i++) s = s.replaceAll(numArray[i],num[i]);
        
        int answer;
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
