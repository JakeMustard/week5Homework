package week5homework; // Declares the package name for the class.

public class App { // Defines a class named App.

    public static void main(String[] args) { // The main method, the entry point of the application.
        Logger asteriskLogger = new AsteriskLogger(); // Creates an instance of the AsteriskLogger class and assigns it to the asteriskLogger variable.
        asteriskLogger.log("Hello"); // Calls the log method of the asteriskLogger instance with the message "Hello".
        asteriskLogger.error("Hello"); // Calls the error method of the asteriskLogger instance with the error message "Something went wrong".

        Logger spacedLogger = new SpacedLogger(); // Creates an instance of the SpacedLogger class and assigns it to the spacedLogger variable.
        spacedLogger.log("Hello"); // Calls the log method of the spacedLogger instance with the message "Hello".
        spacedLogger.error("Hello"); // Calls the error method of the spacedLogger instance with the error message "Something went wrong".
    }
}



