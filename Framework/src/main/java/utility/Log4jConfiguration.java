package utility;

import org.apache.log4j.Logger;

public class Log4jConfiguration {
	public static Logger logger = Logger.getLogger(Log4jConfiguration.class);

	public void testLoggerDebug() {
		logger.debug("im in Debug method");
	}

	public void testLoggerInfo() {
		logger.info("im in Info method");
	}

	public void testLoggerWarn() {
		logger.warn("im in Warn method");
	}

	public void testLoggerError() {
		logger.error(" im in Error method");
	}

	public void testLoggerFatal() {
		logger.fatal("im in Fatal method");
	}

	public static void main(String[] args) {
		Log4jConfiguration log = new Log4jConfiguration();
		log.testLoggerDebug();
		log.testLoggerInfo();
		log.testLoggerWarn();
		log.testLoggerError();
		log.testLoggerFatal();
	}
}
