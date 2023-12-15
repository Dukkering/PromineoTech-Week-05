package week05project;


public class AsteriskLogger implements Logger{
	

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
		
	}

	@Override
	public void error(String error) {
		int length = error.length() + 7; // Variable to get the length of the message + 7 spaces for 'Error: '
		String border = getAsteriskBorder(length); // Calling on the method to get the proper top and bottom border length
		System.out.println(border);
		System.out.println("***Error: " + error + "***");
		System.out.println(border);
		
	}
	// Method to make the asterisks top and bottom border to equal the rough length of the error message
	// Uses the for loop to place one asterisk per character in the length of the error message, plus 6 for some padding.
	private String getAsteriskBorder(int length) {
		StringBuilder border = new StringBuilder();
		for (int i = 0; i < length + 6; i++) {
			border.append("*");
		}
		return border.toString();
	}

}
