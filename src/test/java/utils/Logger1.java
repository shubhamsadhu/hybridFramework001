package utils;

import org.apache.logging.log4j.*;

public class Logger1 {

	private static Logger logger = LogManager.getLogger("LoggerDemo");
	
	public static void info(String message) {
		logger.info(message);
	}
}
