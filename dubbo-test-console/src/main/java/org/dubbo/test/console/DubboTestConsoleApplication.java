package org.dubbo.test.console;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DubboTestConsoleApplication {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) throws IOException {
		context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo-provider.xml"});
        context.start();
        System.in.read();
	}
}
