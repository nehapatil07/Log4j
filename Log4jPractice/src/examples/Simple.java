package examples;

import org.apache.log4j.Logger;

public class Simple {
	static Logger logs=Logger.getLogger(Simple.class);
public static void main(String[] args) {
	logs.info("Hello");
	logs.info("Hi");
}
}
