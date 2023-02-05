package logger.config;

public abstract class LoggerConfiguration {
    private LoggingLevel level;
    private String format;

    public LoggerConfiguration(LoggingLevel level, String format) {
        this.level = level;
        this.format = format;
    }

    public LoggerConfiguration() {
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
