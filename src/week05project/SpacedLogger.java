package week05project;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		StringBuilder spacedMessage = new StringBuilder();
		// Uses a for loop to go through the length of the log string and sticks a " " space after every character
		
		for (int i = 0; i < log.length(); i++) {
			spacedMessage.append(log.charAt(i)).append(" ");
		}
		System.out.println(spacedMessage.toString().trim());
		// .trim() at the end to remove the last space for cleanliness sake, suggested by our dear ChatGPT. Thanks chatGPT!
		
		
	}

	@Override
	public void error(String error) {
		
		StringBuilder spacedErrorMessage = new StringBuilder("ERROR: ");
		
			for (int i = 0; i < error.length(); i++) {
				spacedErrorMessage.append(error.charAt(i)).append(" ");
		}
			System.out.println(spacedErrorMessage.toString().trim());
		
	}

}
