package demo.log4j;

import org.apache.log4j.Logger;

public class Test {
	private static Logger log = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		log.debug("debug");
		log.info("info");
		log.error("error");
	}
}