package SingltonDesign;

public class Main  {
    static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Hello, Singleton Logger!");

        Logger logger1 = Logger.getInstance();
        logger1.log("This is the same logger instance.");

        System.out.println(logger == logger1);

    }
}