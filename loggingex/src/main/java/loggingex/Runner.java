package loggingex;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Runner {
	
	public static Logger LOGGER = LogManager.getLogger();
	
	public void logMessage(String message) {
	    LOGGER.info(message);
	}
	
	public static void main(String[] args) {
		
		LOGGER.fatal("The program seems to have Crashed");
		LOGGER.info("TEST");
	}
	
	

}
