package logger.logger;

import logger.config.ConsoleLoggerConfiguration;
import logger.config.LoggingLevel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger extends Logger {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public ConsoleLogger(ConsoleLoggerConfiguration consoleLoggerConfiguration) {
        super(consoleLoggerConfiguration);
    }

    public void debug(String message) {
        if (getConsoleLoggerConfiguration().getLevel().equals(LoggingLevel.DEBUG)) {
            log(LoggingLevel.DEBUG, message);
        }
    }

    public void info(String message) {
        log(LoggingLevel.INFO, message);
    }

    public void log(LoggingLevel loggingLevel, String message) {
        System.out.println(String.format(getConsoleLoggerConfiguration().getFormat(), LocalDateTime.now().format(formatter), loggingLevel, message));
    }

    public ConsoleLoggerConfiguration getConsoleLoggerConfiguration() {
        return (ConsoleLoggerConfiguration) super.getLoggerConfiguration();
    }
}

