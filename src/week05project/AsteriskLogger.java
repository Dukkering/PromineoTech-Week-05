package week05project;


public class AsteriskLogger implements Logger{
	

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
		
	}

	@Override
	public void error(String error) {
		int length = error.length() + 7;
		String border = getAsteriskBorder(length);
		System.out.println(border);
		System.out.println("***Error: " + error + "***");
		System.out.println(border);
		
	}
	
	private String getAsteriskBorder(int length) {
		StringBuilder border = new StringBuilder();
		for (int i = 0; i < length + 6; i++) {
			border.append("*");
		}
		return border.toString();
	}

}
