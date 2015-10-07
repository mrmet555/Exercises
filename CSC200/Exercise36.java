import javax.swing.JOptionPane;

public class Exercise36 {
	public enum Month { 
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December;
	}
		
	public static void main(String[] args){
		Month[] selection = {
				Month.January,
				Month.February,
				Month.March,
				Month.April,
				Month.May,
				Month.June,
				Month.July,
				Month.August,
				Month.September,
				Month.October,
				Month.November,
				Month.December
		};
		Month input = (Month) JOptionPane.showInputDialog(null, "Please select the current month.", null, JOptionPane.CANCEL_OPTION, null, selection, selection[0]);
		while (input != null){
			String months = input.toString();
			switch(months){
			case "January": case "February": case "December":
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				input = (Month) JOptionPane.showInputDialog(null, "Please select the current month.", null, JOptionPane.CANCEL_OPTION, null, selection, selection[0]);
			case "March": case "April": case "May":
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				input = (Month) JOptionPane.showInputDialog(null, "Please select the current month.", null, JOptionPane.CANCEL_OPTION, null, selection, selection[0]);
			case "June": case "July": case "August":
				JOptionPane.showMessageDialog(null, "It's summer time.");
				input = (Month) JOptionPane.showInputDialog(null, "Please select the current month.", null, JOptionPane.CANCEL_OPTION, null, selection, selection[0]);
			case "September": case "October": case "November":
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				input = (Month) JOptionPane.showInputDialog(null, "Please select the current month.", null, JOptionPane.CANCEL_OPTION, null, selection, selection[0]);
			}
			
		}
	}
}


