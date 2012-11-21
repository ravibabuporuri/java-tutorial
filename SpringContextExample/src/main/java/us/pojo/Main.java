package us.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		
		Service helloService = context.getBean("HelloService Ben", Service.class);
		Service goodbyeService = context.getBean("GoodbyeService", Service.class);
		Service conversationService = context.getBean("ConversationService", Service.class);
		helloService.doSomething();
		goodbyeService.doSomething();
		conversationService.doSomething();
	}
}
