

import javax.swing.JOptionPane;

public class Assignment3 {
	public enum AccType { Administrator, Staff, Student};
	public static void main(String[] args) {
		String user, pass;
		String[] coruser = {"Daniel", "Michael", "Green"};
		String[] corpass = {"1", "2", "3"};
		AccType[] account = {AccType.Administrator, AccType.Staff, AccType.Student};
		int tries = 0;
		int LIMIT = 2;
		int userindex = 0;
		int passindex = 0;
		
		//prompt user for account, then username and password
		AccType input = (AccType) JOptionPane.showInputDialog(null, "Please select your account type", null, JOptionPane.QUESTION_MESSAGE, null, account, account[0]);
		user = JOptionPane.showInputDialog("Please enter your username");
		pass = JOptionPane.showInputDialog("Please enter your password");
		
		//begin loop
			while(tries < LIMIT){
					if (user.equals(coruser[userindex]) && pass.equals(corpass[passindex])){
						String Acc = input.toString();
						switch(Acc){
						case "Administrator":
							if (userindex == 0){
								JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read files.");
								System.exit(0);
							}
						case "Staff":
							if (userindex == 1){
								JOptionPane.showMessageDialog(null, "Welcome Student! You can only read files.");
								System.exit(0);
							}
						case "Student":
							if (userindex == 2){
								JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
								System.exit(0);
							}
						default: 
							JOptionPane.showMessageDialog(null, "Please select your account type again.");
							input = (AccType) JOptionPane.showInputDialog(null, "Please select your account type", null, JOptionPane.QUESTION_MESSAGE, null, account, account[0]);
						}	
					}else if (!user.equals(coruser[userindex]) && !pass.equals(corpass[passindex]) && userindex<2 && passindex<2){
						userindex++;
						passindex++;
					}else {
						JOptionPane.showMessageDialog(null, "Invalid username or password.");
						user = JOptionPane.showInputDialog("Please enter your username");
						pass = JOptionPane.showInputDialog("Please enter your password");
						tries++;
						//increment tries number each time the username or password is in correct
					}
				
			}
		//end loop and display exit message
		 JOptionPane.showMessageDialog(null, "Contact Administrator!");
		 System.exit(0);
}
}