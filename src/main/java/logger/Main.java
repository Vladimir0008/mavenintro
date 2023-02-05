package logger;

import logger.config.ConsoleLoggerConfiguration;
import logger.config.ConsoleLoggerConfigurationLoader;
import logger.config.FileLoggerConfiguration;
import logger.config.FileLoggerConfigurationLoader;
import logger.logger.ConsoleLogger;
import logger.logger.FileLogger;
import logger.logger.Logger;

public class Main {
    public static void main(String[] args) {

        FileLoggerConfigurationLoader configLoader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration config = configLoader.load();

        ConsoleLoggerConfigurationLoader consoleConfigLoader = new ConsoleLoggerConfigurationLoader();
        ConsoleLoggerConfiguration config1 = consoleConfigLoader.load();

        Logger logger1 = new FileLogger(config);
        Logger logger2 = new ConsoleLogger(config1);

        logger1.info("info message to file");
        logger1.debug("debug message to file");

        logger2.info("info message to console");
        logger2.debug("debug message to console");
    }
}
