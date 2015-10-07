import javax.swing.JOptionPane;


public class ClassExercise35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] users = {"Administrator", "Faculty", "Staff", "Student", "Guest"};
		Object selectedUser = JOptionPane.showInputDialog(null, "Please select your role", null, JOptionPane.PLAIN_MESSAGE, null, users, users[0]);
		String user = selectedUser.toString();
		switch(user){
		case "Administrator":
			JOptionPane.showMessageDialog(null, "Welcome Administrator!");
			break;
		case "Faculty":
			JOptionPane.showMessageDialog(null, "Welcome Faculty!");
			break;
		case "Staff":
			JOptionPane.showMessageDialog(null, "Welcome Staff!");
			break;
		case "Student":
			JOptionPane.showMessageDialog(null, "Welcome Student!");
			break;
		case "Guest":
			JOptionPane.showMessageDialog(null, "Welcome Guest!");
			break;
		}

	}

}
