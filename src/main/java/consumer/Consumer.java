package consumer;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import provider.DemoService;

public class Consumer {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext-dubbo.xml"});
		
		context.start();
		
		DemoService demoService = (DemoService)context.getBean("demoService");
		String hello = demoService.sayHello("tom");
		System.out.println(hello);
		
		List list = demoService.getUsers();
		if(list != null && list.size() > 0) {
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i));
			}
		}
		
		System.in.read();
	}

}
