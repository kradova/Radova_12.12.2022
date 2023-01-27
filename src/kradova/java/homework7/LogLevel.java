package homework7;

public enum LogLevel {
    INFO("\u001B[32m"),
    DEBUG("\u001B[34m"),
    WARN("\u001B[33m"),
    ERROR("\u001B[31m"),
    RESET("\u001B[0m");

    private String level;

    LogLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return level;
    }
}
