package _01_random._6_lottery_numbers;

import java.util.Random;
import javax.swing.JOptionPane;



public class Lottery {
	public static void main(String[] args) {
		Random ran = new Random();
		String lottery = "";
		for (int i = 0; i<6; i++) {
			int r = ran.nextInt(60);
			lottery += r + "  ";

		}
		JOptionPane.showMessageDialog(null, lottery);
	}
}