package logger.logger;

import logger.config.FileLoggerConfiguration;
import logger.config.LoggingLevel;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger extends Logger {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        super(fileLoggerConfiguration);
    }

    public void debug(String message) {
        if (super.getLoggerConfiguration().getLevel().equals(LoggingLevel.DEBUG)) {
                log(LoggingLevel.DEBUG, message);
        }
    }

    public void info(String message) {
            log(LoggingLevel.INFO, message);
    }

    public void createFile(FileLoggerConfiguration fileLoggerConfiguration) {
        fileLoggerConfiguration.setFilePath(fileLoggerConfiguration.getFilePath()
                .replaceFirst(fileLoggerConfiguration
                        .getFilePath().substring(fileLoggerConfiguration.getFilePath()
                                .lastIndexOf("/") + 1,
                        fileLoggerConfiguration.getFilePath()
                                .lastIndexOf(".")),
                "log_" + LocalDateTime.now().format( DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"))));
    }

    public void log(LoggingLevel loggingLevel, String message) {
            BufferedWriter writer = null;
            try {
                if (new File(getFileLoggerConfiguration().getFilePath()).length() >= getFileLoggerConfiguration().getMaxLogFileSize()) {
                    createFile(getFileLoggerConfiguration());
                }
                writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(new File(getFileLoggerConfiguration().getFilePath()), true)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                writer.write(String.format(getFileLoggerConfiguration().getFormat(), LocalDateTime.now().format(formatter), loggingLevel, message));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public FileLoggerConfiguration getFileLoggerConfiguration() {
        return (FileLoggerConfiguration) super.getLoggerConfiguration();
    }
}
