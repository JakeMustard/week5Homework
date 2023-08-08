package week5homework; // Declares the package name for the class.

public class SpacedLogger implements Logger { // Defines a class named SpacedLogger that implements the Logger interface.

    @Override
    public void log(String message) { // Implements the 'log' method required by the Logger interface.
        StringBuilder spacedMessage = new StringBuilder(); // Creates a StringBuilder to build the spaced message.
        for (int i = 0; i < message.length(); i++) { // Iterates through each character in the input message.
            spacedMessage.append(message.charAt(i)).append(" "); // Appends each character followed by a space to the spacedMessage StringBuilder.
        }
        System.out.println(spacedMessage.toString().trim()); // Prints the spaced message after trimming any trailing spaces.
    }

    @Override
    public void error(String message) { // Implements the 'error' method required by the Logger interface.
        StringBuilder spacedErrorMessage = new StringBuilder("ERROR: "); // Creates a StringBuilder starting with "ERROR: ".
        for (int i = 0; i < message.length(); i++) { // Iterates through each character in the error message.
            spacedErrorMessage.append(message.charAt(i)).append(" "); // Appends each character followed by a space to the spacedErrorMessage StringBuilder.
        }
        System.out.println(spacedErrorMessage.toString().trim()); // Prints the spaced error message after trimming any trailing spaces.
    }
}



