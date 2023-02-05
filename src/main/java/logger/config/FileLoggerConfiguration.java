package logger.config;


public class FileLoggerConfiguration extends LoggerConfiguration {
    private String filePath;
    private int maxFileSize;


    public FileLoggerConfiguration(String filePath, LoggingLevel level, byte maxLogFileSize, String format) {
        super(level, format);
        this.filePath = filePath;
        this.maxFileSize = maxLogFileSize;
    }

    public FileLoggerConfiguration() {

    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getMaxLogFileSize() {
        return maxFileSize;
    }

    public void setMaxLogFileSize(int maxLogFileSize) {
        this.maxFileSize = maxLogFileSize;
    }

    public LoggingLevel getLevel() {
        return super.getLevel();
    }

    public void setLevel(LoggingLevel level) {
        super.setLevel(level);
    }

    public String getFormat() {
        return super.getFormat();
    }

    public void setFormat(String format) {
        super.setFormat(format);
    }
}
