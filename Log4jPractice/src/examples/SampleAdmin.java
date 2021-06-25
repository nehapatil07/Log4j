package examples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SampleAdmin {
static Logger logs=Logger.getLogger(SampleAdmin.class);
public static void main(String[] args) {
	//PropertyConfigurator.configure("log4j.properties");
	logs.debug("SampleAdmin debug message");
	logs.info("SampleAdmin info message");
	logs.warn("SampleAdmin warn message");
	logs.error("SampleAdmin error message");
	logs.fatal("SampleAdmin fatal message");
	SampleReport obj=new SampleReport();
	obj.generateReport();
	
}
}
