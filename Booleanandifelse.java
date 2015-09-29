import javax.swing.JOptionPane;


public class Booleanandifelse {
	public static void main(String[] args) {
		String numPeople, numPlayer;
		int groupSize, teamSize;
		numPeople = "";
		groupSize = 0;
		numPlayer = "";
		teamSize = 0;
		
		numPeople = JOptionPane.showInputDialog("Please enter the number of people:");
		numPlayer = JOptionPane.showInputDialog("Please enter the number of players:");
		int numPeople2 = Integer.parseInt(numPeople);
		int numPlayer2 = Integer.parseInt(numPlayer);
		if (numPeople2>10) {
			//true statements
			groupSize = numPeople2/2;
			JOptionPane.showMessageDialog(null, "The number of people is " + numPeople2 + " and the group size is " + groupSize + ".");
		} else if (numPeople2>=3){
			//true statements
			groupSize = numPeople2/3;
			JOptionPane.showMessageDialog(null, "The number of people is " + numPeople2 + " and the group size is " + groupSize + ".");
		} else {
			//false statements
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
		}
		if (numPlayer2<=55 && numPlayer2>=11) {
			//true statements
			teamSize = numPlayer2/11;
		} else {
			//false statements
			teamSize = 1;
		}
//		JOptionPane.showMessageDialog(null, "The number of people is " + numPeople2 + " and the group size is " + groupSize + ".");
		JOptionPane.showMessageDialog(null, "The number of players is " + numPlayer2 + " and the team size is " + teamSize + ".");
	}
}
