package week5homework;



public class App {
	
	    public static void main(String[] args) {
	        Logger asteriskLogger = new AsteriskLogger();
	        asteriskLogger.log("Hello");
	        asteriskLogger.error("Something went wrong");

	        Logger spacedLogger = new SpacedLogger();
	        spacedLogger.log("Hello");
	        spacedLogger.error("Something went wrong");
	    }
	}


