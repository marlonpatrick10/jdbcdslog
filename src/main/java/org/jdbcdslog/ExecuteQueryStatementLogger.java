package org.jdbcdslog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class was created in Alclog.
 *
 * @author Marlon Patrick
 * @since Jun 1, 2017
 */
public class ExecuteQueryStatementLogger {


	private static Logger logger = LoggerFactory.getLogger(ExecuteQueryStatementLogger.class);

	public static void info(String s) {
		logger.info(s + LogUtils.getStackTrace());
	}

	public static boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public static void error(String m, Throwable t) {
		logger.error(m, t);
	}

	public static Logger getLogger() {
		return logger;
	}
}
