package logger.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConsoleLoggerConfigurationLoader implements ConfigurationLoader {
    private FileInputStream fileInputStream;
    private Properties properties = new Properties();

    public ConsoleLoggerConfiguration load() {
        ConsoleLoggerConfiguration consoleLoggerConfiguration = new ConsoleLoggerConfiguration();

        try {
            fileInputStream = new FileInputStream("src/main/resources/config.properties");
            properties.load(fileInputStream);

            consoleLoggerConfiguration.setLevel(LoggingLevel.valueOf(properties.getProperty("LEVEL")));
            consoleLoggerConfiguration.setFormat(properties.getProperty("FORMAT"));
        } catch (IOException e) {
            System.err.println("ERROR! Config file does not exist!");
        }
        return consoleLoggerConfiguration;
    }
}
