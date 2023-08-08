package week5homework;  // This declares the package name where the class resides.

public class AsteriskLogger implements Logger {  // This defines a class named AsteriskLogger that implements the Logger interface.

    @Override
    public void log(String message) {  // This is a method declaration for implementing the log() method from the Logger interface.
        System.out.println("***" + message + "***");  // This prints the provided 'message' enclosed in three asterisks on each side.
    }

    @Override
    public void error(String message) {  // This is a method declaration for implementing the error() method from the Logger interface.
        System.out.println("****************");  // This prints a line of asterisks to create a visual separator.
        System.out.println("***Error: " + message + "***");  // This prints an error message with the provided 'message' surrounded by asterisks and prepended with "Error: ".
        System.out.println("****************");  // This prints another line of asterisks to complete the visual separator.
    }
}



