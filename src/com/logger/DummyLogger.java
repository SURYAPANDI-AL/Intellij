package com.logger;

import java.io.IOException;
import java.util.logging.*;

public class DummyLogger extends Logger {

    private static Logger myLogger;

    public DummyLogger(String logFile) throws IOException {
        super("mydummy",null);
        /*
        Logger class is used to create the logs to monitor the functionality of the program
         */
        myLogger = Logger.getLogger("my-logger");

        /*
        set the Logger object level
        the hierarchy goes severe -> warning -> info ->config -> fine -> finer -> finest
         */
        myLogger.setLevel(Level.WARNING);

        // create the file handler to keep the logs
        FileHandler fileHandler = new FileHandler(logFile, true);
        Formatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        // create a console handler to show the logs in the console window
        ConsoleHandler consoleHandler = new ConsoleHandler();

        //add handlers to the logger
        myLogger.addHandler(fileHandler);
        myLogger.addHandler(consoleHandler);
    }

    public void logInfo(String message) {
        myLogger.info(message);
    }

    public void logWarn(String message) {
        myLogger.warning(message);
    }

    public void logSevere(String message) {
        myLogger.severe(message);
    }


}
