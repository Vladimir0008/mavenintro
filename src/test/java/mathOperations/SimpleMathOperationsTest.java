package mathOperations;

import logger.config.ConsoleLoggerConfiguration;
import logger.config.ConsoleLoggerConfigurationLoader;
import logger.logger.ConsoleLogger;
import logger.logger.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathOperationsTest {
    ConsoleLoggerConfigurationLoader consoleConfigLoader = new ConsoleLoggerConfigurationLoader();
    ConsoleLoggerConfiguration config = consoleConfigLoader.load();
    Logger logger = new ConsoleLogger(config);

    @Test
    public void addTestSimple() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(5, simpleMathLibrary.add(2, 3));
        logger.info("addTestSimple should return \"true\", " +
                "result: " + simpleMathLibrary.add(2, 3));
    }

    @Test
    public void addTestSimpleReverse() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(5, simpleMathLibrary.add(3, 2));
        logger.info("addTestSimpleReverse should return \"true\", " +
                "result: " + simpleMathLibrary.add(3, 2));
    }

    @Test
    public void addTestNegativeValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(-5, simpleMathLibrary.add(-3, -2));
        logger.info("addTestNegativeValues should return \"true\", " +
                "result: " + simpleMathLibrary.add(-3, -2));
    }

    @Test
    public void addTestZeroValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(0, simpleMathLibrary.add(0, 0));
        logger.info("addTestZeroValues should return \"true\", " +
                "result: " + simpleMathLibrary.add(0, 0));
    }

    @Test
    public void addTestPositiveValueAndZero() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(1, simpleMathLibrary.add(1, 0));
        logger.info("addTestPositiveValueAndZero should return \"true\", " +
                "result: " + simpleMathLibrary.add(1, 0));
    }

    @Test
    public void minusSimple() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(3, simpleMathLibrary.minus(5,2));
        logger.info("minusSimple should return \"true\", " +
                "result: " + simpleMathLibrary.minus(5,2));
    }

    @Test
    public void minusSimpleReverse() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(-3, simpleMathLibrary.minus(2,5));
        logger.info("minusSimpleReverse should return \"true\", " +
                "result: " + simpleMathLibrary.minus(2,5));
    }

    @Test
    public void minusNegativeValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(3, simpleMathLibrary.minus(-2,-5));
        logger.info("minusNegativeValues should return \"true\", " +
                "result: " + simpleMathLibrary.minus(-2,-5));
    }

    @Test
    public void minusTheSameValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(0, simpleMathLibrary.minus(2,2));
        logger.info("minusTheSameValues should return \"true\", " +
                "result: " + simpleMathLibrary.minus(2,2));
    }

    @Test
    public void minusPositiveAndNegativeValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(4, simpleMathLibrary.minus(2,-2));
        logger.info("minusPositiveAndNegativeValues should return \"true\", " +
                "result: " + simpleMathLibrary.minus(2,-2));
    }

    @Test
    public void minusNegativeAndPositiveValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(-4, simpleMathLibrary.minus(-2,2));
        logger.info("minusNegativeAndPositiveValues should return \"true\", " +
                "result: " + simpleMathLibrary.minus(-2,2));
    }
}