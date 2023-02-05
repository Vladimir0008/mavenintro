package mathOperations;

import logger.config.ConsoleLoggerConfiguration;
import logger.config.ConsoleLoggerConfigurationLoader;
import logger.logger.ConsoleLogger;
import logger.logger.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayHandlerTest {
    ConsoleLoggerConfigurationLoader consoleConfigLoader = new ConsoleLoggerConfigurationLoader();
    ConsoleLoggerConfiguration config = consoleConfigLoader.load();
    Logger logger = new ConsoleLogger(config);

    @Test
    void testOneFourArrayCheckerSimpleWithOneFourArray() {
        int[] arr5 = new int[]{1, 4};
        Assertions.assertEquals(true, ArrayHandler.oneFourArrayChecker(arr5));
        logger.info("testOneFourArrayCheckerSimpleWithOneFourArray should return \"true\", " +
                "result: " + ArrayHandler.oneFourArrayChecker(arr5));
    }

    @Test
    void testOneFourArrayCheckerSimpleWithOneFourArrayReverse() {
        int[] arr5 = new int[]{4, 1};
        Assertions.assertEquals(true, ArrayHandler.oneFourArrayChecker(arr5));
        logger.info("testOneFourArrayCheckerSimpleWithOneFourArrayReverse should return \"true\", " +
                "result: " + ArrayHandler.oneFourArrayChecker(arr5));
    }

    @Test
    void testOneFourArrayCheckerWithOtherFigure() {
        int[] arr5 = new int[]{4, 3, 1};
        Assertions.assertEquals(false, ArrayHandler.oneFourArrayChecker(arr5));
        logger.info("testOneFourArrayCheckerWithOtherFigure should return \"true\", " +
                "result: " + ArrayHandler.oneFourArrayChecker(arr5));
    }

    @Test
    void testOneFourArrayCheckerWithOnlyOne() {
        int[] arr5 = new int[]{1, 1, 1};
        Assertions.assertEquals(false, ArrayHandler.oneFourArrayChecker(arr5));
        logger.info("testOneFourArrayCheckerWithOnlyOne should return \"true\", " +
                "result: " + ArrayHandler.oneFourArrayChecker(arr5));

    }

    @Test
    void testOneFourArrayCheckerWithOnlyFour() {
        int[] arr5 = new int[]{4, 4, 4};
        Assertions.assertEquals(false, ArrayHandler.oneFourArrayChecker(arr5));
        logger.info("testOneFourArrayCheckerWithOnlyFour should return \"true\", " +
                "result: " + ArrayHandler.oneFourArrayChecker(arr5));
    }
}