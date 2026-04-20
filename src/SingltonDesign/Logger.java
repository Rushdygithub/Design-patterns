package SingltonDesign;

public class Logger {

    private static Logger logger = new Logger();
    //private String message;

    private Logger() {
        // private constructor to prevent instantiation
    }

    public static Logger getInstance() {
        return logger;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }

}
