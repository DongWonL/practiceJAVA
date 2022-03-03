package methodMenu;

/**
 * @author kongzi
 * @date 2022. 3. 3. - 오후 9:17:42
 * @subject drawLine_Method
 * @content
 */
public class drawLine {

	public static void main(String[] args) {

	}

	public static void drawLine(int n, char style) {

		// System.out.println("------------");
		for (int i = 0; i < n; i++) {
			System.out.print(style);
		}
		System.out.println();
	}// drawLine

}
