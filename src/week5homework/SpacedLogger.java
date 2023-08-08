package week5homework;

public class SpacedLogger implements Logger {

			@Override
	    public void log(String message) {
	        StringBuilder spacedMessage = new StringBuilder();
	        for (int i = 0; i < message.length(); i++) {
	            spacedMessage.append(message.charAt(i)).append(" ");
	        }
	        System.out.println(spacedMessage.toString().trim());
	    }

	    @Override
	    public void error(String message) {
	        StringBuilder spacedErrorMessage = new StringBuilder("ERROR: ");
	        for (int i = 0; i < message.length(); i++) {
	            spacedErrorMessage.append(message.charAt(i)).append(" ");
	        }
	        System.out.println(spacedErrorMessage.toString().trim());
	    }
	}


