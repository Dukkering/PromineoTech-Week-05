package week05project;

public class App {

	public static void main(String[] args) {
	
		AsteriskLogger asteriskLog = new AsteriskLogger();
		asteriskLog.log("Hello!");
		asteriskLog.log("Your mother was a hamster and your father smelt of elderberries!");
		
		
		AsteriskLogger asteriskError = new AsteriskLogger();
		asteriskError.error("Hello");
		asteriskError.error("What is the unladen flying speed of a swallow?");
		
		SpacedLogger spacedLog = new SpacedLogger();
		spacedLog.log("Hello!");
		spacedLog.log("It could carry it by the husk!");
		
		SpacedLogger spacedError = new SpacedLogger();
		spacedError.error("Hello!");
		spacedError.error("We are the Knights who say Ni!");
		
		
	

	}

}
