package examples;

import org.apache.log4j.Logger;

public class SampleReport {
static Logger logs=Logger.getLogger(SampleReport.class);
	public void generateReport() {
		logs.debug("samplereport debug message");
		logs.info("sample report info message");
		logs.warn("sample report info message");
		logs.error("sample report info message");
		logs.fatal("sample report info message");
		
	}

}
