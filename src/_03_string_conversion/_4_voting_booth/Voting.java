package _03_string_conversion._4_voting_booth;
import javax.swing.JOptionPane;

public class Voting {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What is your age?");
		int ageAsInt = Integer.parseInt(age);
		if (ageAsInt >= 18) {
			JOptionPane.showMessageDialog(null, "Who is the next president?");
		}
		if (ageAsInt < 18) {
			JOptionPane.showMessageDialog(null, "GO AWAY, UR TOO YOUNG!!!");
		}
	}

}
