package homework7;

public class MyLogger implements Logger{
    @Override
    public void log(String message, LogLevel level) {
        System.out.println("LOG: " + level + message + LogLevel.RESET);
    }
}
