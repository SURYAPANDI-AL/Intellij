package com.logger;

import sun.util.logging.PlatformLogger;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Formatter;
import java.util.function.Supplier;
import java.util.logging.*;

public class LoggerClass {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws IOException {

        FileHandler fileHandler = new FileHandler("logger.txt", true);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        DummyFilter filter = new DummyFilter();
        logger.setFilter(filter);
        System.out.println("MyFilter" + logger.getFilter());
        logger.addHandler(fileHandler);
        logger.setLevel(Level.SEVERE);

        logger.fine("fine msg");
        logger.finer("finer msg");
        logger.finest("finest msg");
        logger.config("config message");
        logger.info("info msg");
        logger.warning("warning msg");
        logger.severe("severe msg");


        logger.config(() -> "Supplier  msg");
        logger.fine(() -> "Supplier  msg");
        logger.finer(() -> "Supplier  msg");
        logger.finest(() -> "Supplier msg");
        logger.config(() -> "Supplier msg");
        logger.info(() -> "Supplier msg");
        logger.warning(() -> "Supplier msg");
        logger.severe(() -> "Supplier msg");

        System.out.println(logger.getLevel());

        dummy();


        Logger anonymousLogger = Logger.getAnonymousLogger();
        System.out.println(logger.getResourceBundleName());
        System.out.println(anonymousLogger.getResourceBundleName());

        /*Locale locale = Locale.JAPAN;
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        Logger anonymousLoggerWithResourceBundle = Logger.getAnonymousLogger("message");
        anonymousLoggerWithResourceBundle.setResourceBundle(resourceBundle);
        System.out.println(anonymousLoggerWithResourceBundle.getResourceBundleName());
        anonymousLoggerWithResourceBundle.info(resourceBundle.getString("greeting"));
        anonymousLoggerWithResourceBundle.severe(resourceBundle.getString("error"));*/

        Logger logger1 = Logger.getGlobal();
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger1.addHandler(consoleHandler);
        System.out.println(logger1.equals(logger));

        Handler[] handlers = logger.getHandlers();

        System.out.println(Arrays.toString(handlers));
        System.out.println(logger.getName());
        System.out.println(logger.getParent().getName() + " empty");

        System.out.println(logger.getResourceBundleName());
        System.out.println(logger.getUseParentHandlers());

        System.out.println(logger.isLoggable(Level.FINE));
        System.out.println(logger.isLoggable(Level.FINER));
        System.out.println(logger.isLoggable(Level.FINEST));
        System.out.println(logger.isLoggable(Level.CONFIG));
        System.out.println(logger.isLoggable(Level.INFO));
        System.out.println(logger.isLoggable(Level.WARNING));
        System.out.println(logger.isLoggable(Level.SEVERE));

        logger.log(Level.INFO, "info using log method");
        logger.log(Level.INFO, "LOG method with parameter", 1);
        logger.log(Level.INFO, "LOG method with parameter array", new Integer[]{1, 2});
        logger.log(Level.INFO, "LOG method with throwable", new NullPointerException());
        logger.log(Level.INFO, () -> "supplier info");
        logger.log(Level.INFO, new ArithmeticException(), () -> "supplier info");

        LogRecord logRecord = new LogRecord(Level.SEVERE, "log record severe");
        logger.log(logRecord);

        Level level = Level.INFO;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(Arrays.toString(stackTraceElements));
        StackTraceElement stackTraceElement = stackTraceElements[1];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();


        logger.logp(level, className, methodName, "msg");
        logger.logp(level, className, methodName, "msg", 1);
        logger.logp(level, className, methodName, "msg", new Object[]{1, 3});
        logger.logp(level, className, methodName, "msg", new NullPointerException());
        logger.logp(level, className, methodName, () -> "supplier msg");
        logger.logp(level, className, methodName, new RuntimeException(), () -> "supplier msg");


        logger.logrb(level, className, methodName, logger.getResourceBundle(), "msg", 1, 2, 3, 4, 56, 7);
        logger.logrb(level, className, methodName, logger.getResourceBundle(), "msg", new Throwable());

        logger.removeHandler(consoleHandler);

        DummyLogger dummyLogger = new DummyLogger("frictional1.txt");

        logger.setParent(dummyLogger);
        logger.throwing(className, methodName, new RuntimeException());

    }


    private static void dummy() {
        logger.entering(System.class.getName(), "method dummy");
        Object object = "parameter";
        logger.entering(System.class.getName(), "Method dummy", object);
        Object[] objects = new Object[]{"param1", "param2"};
        logger.entering(System.class.getName(), "Method Dummy", objects);

        logger.exiting(System.class.getName(), "method dummy");
        logger.exiting(System.class.getName(), "Method dummy", object);
        //there is no method for exit as passing the array as parameter.
    }
}
